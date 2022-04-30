package com.hanxiao.service;

import com.hanxiao.anno.CountTime;
import com.hanxiao.bean.User;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/

public class UserServiceImpl implements UserService {
    @Override
    public void sayHello1() {
        //public void com.hanxiao.service.UserServiceImpl.sayHello1()
    }

    @Override
    public String sayHello2() {
        //public String com.hanxiao.service.UserServiceImpl.sayHello2()
        return null;
    }

    @Override
    public User sayhello3() {
        //public com.hanxiao.service.bean.User com.hanxiao.service.UserServiceImpl.sayHello3()
        return null;
    }

    @Override
    public String sayHello4(String param) {
        //public String com.hanxiao.service.UserServiceImpl.sayHello4(String)
        return null;
    }

    @Override
    public String sayHello5(String param1, String param2) {
        //public String com.hanxiao.service.UserServiceImpl.sayHello5(String, String)
        return null;
    }

    @CountTime
    @Override
    public String sayHello6(String param1, User param2) {
        //public String com.hanxiao.service.UserServiceImpl.sayHello6(String, com.hanxiao.bean.User)
        return null;
    }
}
