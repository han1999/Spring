package com.hanxiao;


import com.hanxiao.annotation.service.UserService;
import com.hanxiao.get_bean.service.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class AnnotationTest {

    @Autowired
//    @Qualifier("userServiceProxy")
            UserService userService;


    @Test
    public void testAnnotation() {
//        userService.sayHello();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        UserServiceImpl bean = applicationContext.getBean(UserServiceImpl.class);
        bean.sayHello();
    }
}
