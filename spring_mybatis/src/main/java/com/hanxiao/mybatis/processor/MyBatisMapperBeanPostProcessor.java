package com.hanxiao.mybatis.processor;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/
@Component
public class MyBatisMapperBeanPostProcessor implements BeanPostProcessor {

    @Autowired
    SqlSessionFactory sqlSessionFactory;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanName = " + beanName);
        if (!beanName.contains("Service")) {
            return bean;
        }

        Object proxy= Enhancer.create(bean.getClass(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                //每次执行一个方法，mapper就更新一次
                Field[] declaredFields = bean.getClass().getDeclaredFields();
                SqlSession sqlSession = sqlSessionFactory.openSession();
                for (Field field : declaredFields) {
                    if (field.getName().contains("Mapper")) {
                        field.setAccessible(true);
                        Class<?> type = field.getType();
                        Object mapper = sqlSession.getMapper(type);
                        field.set(bean, mapper);
                    }
                }
                Object invoke = method.invoke(bean, objects);
                sqlSession.commit();
                sqlSession.close();
                return invoke;
            }
        });
        return proxy;
    }
}
