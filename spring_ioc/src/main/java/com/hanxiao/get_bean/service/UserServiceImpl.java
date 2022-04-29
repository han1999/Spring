package com.hanxiao.get_bean.service;

import com.hanxiao.get_bean.dao.UserDao;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class UserServiceImpl implements UserService {
    UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void sayHello() {
        System.out.println("你好学姐！");
    }
}
