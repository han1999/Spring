package com.hanxiao.lifecycle.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/

public class UserServiceImpl implements UserService,
        BeanNameAware, BeanFactoryAware, ApplicationContextAware,
        InitializingBean, DisposableBean {
    @Override
    public void sayHello() {
        System.out.println("你好学姐！");
    }

    public UserServiceImpl() {
        System.out.println("1. Bean实例化");
    }

    private String param;

    public void setParam(String param) {
        System.out.println("2. 设置属性");
        this.param=param;
    }


   private BeanFactory beanfactory;
   private String beanName;
   private ApplicationContext applicationContext;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("4. beanFactoryAware的setBeanFactory方法");
        this.beanfactory=beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("3. BeanNameAware的setBeanName方法");
        this.beanName = name;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("5. ApplicationContextAware的setApplicationContext方法");
        this.applicationContext = applicationContext;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("7. InitializingBean的afterPropertiesSet方法");
    }

    public void customInit() {
        System.out.println("8. 自定义Init方法");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10. DisposableBean的destroy方法");
    }

    public void customDestroy() {
        System.out.println("11. 自定义的destroy方法");
    }

}
