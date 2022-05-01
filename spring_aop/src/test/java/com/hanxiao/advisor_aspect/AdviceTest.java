package com.hanxiao.advisor_aspect;

import com.hanxiao.advisor_aspect.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class AdviceTest {
    @Autowired
    UserService userService;//UserService类型的，就这一个(UserServiceImpl)
    @Test
    public void testAdvice() {
        userService.method1();
        userService.method2();
    }
}
