package com.hanxiao.lifecycle.post_processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import javax.sql.DataSource;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/

public class CustomBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("6. BeanPostProcessor的postProcessBeforeInitialization方法");
        if (beanName.contains("Service")) {
            System.out.println("Service here!");
//            Object proxy= Enhancer.create()
            // return proxy;
        }
        if (bean instanceof DataSource) {
//            getPassword();
//            password;
//            setPassword();
        }
        return null;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("9. BeanPostProcessor的getProcessAfterInitialization方法");
        return null;
    }
}
