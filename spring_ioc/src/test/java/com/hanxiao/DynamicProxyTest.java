package com.hanxiao;

import com.hanxiao.aop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class DynamicProxyTest {
    @Autowired
    @Qualifier("userServiceProxy")//userService有两个，factoryBean生产的是userServiceImpl代理对象，
            // 因为它有接口，所以用的是jdk代理，生产的就是接口对象
    UserService userService;

    @Test
    public void testProxy() {
        userService.method1();
        userService.method2();
    }
}
