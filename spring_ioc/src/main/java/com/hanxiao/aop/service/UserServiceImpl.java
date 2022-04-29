package com.hanxiao.aop.service;

import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/
@Service("userServiceInAop")
public class UserServiceImpl implements UserService {
    @Override
    public void method1() {
        System.out.println("UserServiceImpl.method1");
    }

    @Override
    public void method2() {
        System.out.println("UserServiceImpl.method2");
    }

    @Override
    public void method3() {
        System.out.println("UserServiceImpl.method3");
    }
}
