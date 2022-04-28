package com.hanxiao.service;

import com.hanxiao.dao.UserDao;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class UserServiceImpl2 implements UserService {
    UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
    @Override
    public void sayHello() {
        System.out.println("你好学长！");
    }
}
