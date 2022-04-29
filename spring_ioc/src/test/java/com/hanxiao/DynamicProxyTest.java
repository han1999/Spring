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
    @Qualifier("userServiceProxy")
    UserService userService;

    @Test
    public void testProxy() {
        userService.method1();
        userService.method2();
    }
}
