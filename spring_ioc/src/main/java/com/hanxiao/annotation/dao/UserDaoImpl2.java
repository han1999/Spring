package com.hanxiao.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/
@Repository
public class UserDaoImpl2 implements UserDao {
    @Override
    public void sayHello() {
        System.out.println("sayHello--2");
    }
}
