package com.hanxiao;

import com.hanxiao.dao.UserDao;
import com.hanxiao.service.UserService;
import com.hanxiao.service.UserServiceImpl;
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
        UserService userService12= (UserService) applicationContext.getBean("userService1");
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
}
