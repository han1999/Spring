package com.hanxiao;

import org.junit.Test;

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
}
