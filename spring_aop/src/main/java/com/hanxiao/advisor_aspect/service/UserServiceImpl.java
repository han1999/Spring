package com.hanxiao.advisor_aspect.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public void method1() {
        System.out.println("UserServiceImpl.method1");
    }

    @Override
    public String method2() {
        System.out.println("UserServiceImpl.method2");
        return null;
    }

    @Override
    public String method3(String name) {
        System.out.println("UserServiceImpl.method3");
        return null;
    }

    @Override
    public String method4(String name) {
        System.out.println("UserServiceImpl.method4");
        int i = 1 / 0;
        return "method4";
    }
}
