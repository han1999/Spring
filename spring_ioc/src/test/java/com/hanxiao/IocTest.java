package com.hanxiao;

import com.hanxiao.factory.bean.User;
import com.hanxiao.get_bean.dao.UserDao;
import com.hanxiao.get_bean.service.UserService;
import com.hanxiao.get_bean.service.UserServiceImpl;
import com.hanxiao.scope.DefaultBean;
import com.hanxiao.scope.PrototypeBean;
import com.hanxiao.scope.SingletonBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class IocTest {

    @Test
    public void test1() {
        UserService userService = new UserServiceImpl();
        userService.sayHello();
    }

    @Test
    public void test2() {
        Map spring = new HashMap<String, Object>();
        spring.put("userService", new UserServiceImpl());
        UserService userService = (UserService) spring.get("userService");
        userService.sayHello();
    }

    @Test
    public void test3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserService userService1 = (UserService) applicationContext.getBean("userService1");
        UserService userService11 = (UserService) applicationContext.getBean("userService1");
        UserService userService12 = (UserService) applicationContext.getBean("userService1");
        userService1.sayHello();

        UserService userService2 = applicationContext.getBean("userService2", UserService.class);
        UserService userService21 = applicationContext.getBean("userService2", UserService.class);
        UserService userService22 = applicationContext.getBean("userService2", UserService.class);
        userService2.sayHello();

    }

    @Test
    public void testCommonUserDao() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserService userService1 = applicationContext.getBean("userService1", UserService.class);
        UserService userService2 = applicationContext.getBean("userService2", UserService.class);
        userService1.sayHello();
        userService2.sayHello();
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.sayHello();
    }

    @Test
    public void testConstructor() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//        NoParamConstructorBean noParamConstructorBean = applicationContext.getBean(NoParamConstructorBean.class);
//        HasParamConstructorBean hasParamConstructorBean = applicationContext.getBean(HasParamConstructorBean.class);
    }

    @Test
    public void testFactory() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//        User user = (User) applicationContext.getBean("userFromStaticFactory");
//        User user2 = (User) applicationContext.getBean("userFromInstanceFactory");
        User user = applicationContext.getBean("userFromStaticFactory", User.class);
        User user2 = applicationContext.getBean("userFromInstanceFactory", User.class);
        System.out.println("user = " + user);
        System.out.println("user2 = " + user2);
    }

    @Test
    public void testFactoryType() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//        User bean = applicationContext.getBean(User.class);
    }

    @Test
    public void testFactoryBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        User user = (User) applicationContext.getBean("userFromFactoryBean");
        System.out.println("user = " + user);

        User user2 = applicationContext.getBean("userFromFactoryBean", User.class);
    }

    @Test
    public void testScope() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        SingletonBean singletonBean1 = applicationContext.getBean(SingletonBean.class);
        SingletonBean singletonBean2 = applicationContext.getBean(SingletonBean.class);
        SingletonBean singletonBean3 = applicationContext.getBean(SingletonBean.class);

        PrototypeBean prototypeBean1 = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean2 = applicationContext.getBean(PrototypeBean.class);
        PrototypeBean prototypeBean3 = applicationContext.getBean(PrototypeBean.class);

        DefaultBean defaultBean1 = applicationContext.getBean(DefaultBean.class);
        DefaultBean defaultBean2 = applicationContext.getBean(DefaultBean.class);
        DefaultBean defaultBean3 = applicationContext.getBean(DefaultBean.class);
    }

    @Test
    public void testLifecycle() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
//        applicationContext
    }

    @Test
    public void testLifecycle2() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        applicationContext.getBean(com.hanxiao.lifecycle.service.UserServiceImpl.class);
        applicationContext.getBean(com.hanxiao.lifecycle.service.UserServiceImpl.class);
        applicationContext.getBean(com.hanxiao.lifecycle.service.UserServiceImpl.class);
        applicationContext.close();
    }

    @Test
    public void testAnnotation() {
        com.hanxiao.annotation.service.UserServiceImpl userService = new com.hanxiao.annotation.service.UserServiceImpl();
//        userService.sayHello();
    }


}
