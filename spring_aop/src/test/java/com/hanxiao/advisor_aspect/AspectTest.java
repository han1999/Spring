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
public class AspectTest {
    @Autowired
    UserService userService;

    @Test//不加test注解，三角号也会出现（但是没有圆圈），会报noRunnalbeMethods错误
    public void testAspect() {
        userService.method1();
        System.out.println();
        String s1 = userService.method2();
        System.out.println("s1 = " + s1);
        System.out.println();
        String s = userService.method3("nihao!");
        System.out.println("s = " + s);
        System.out.println();
//        userService.method4("zaijian");
        System.out.println();
    }
}
