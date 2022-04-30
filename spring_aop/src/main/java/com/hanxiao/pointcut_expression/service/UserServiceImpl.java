package com.hanxiao.pointcut_expression.service;

import com.hanxiao.pointcut_expression.anno.CountTime;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/

public class UserServiceImpl implements com.hanxiao.pointcut_expression.service.UserService {
    @Override
    public void sayHello1() {
        //public void com.hanxiao.pointcut_expression.service.UserServiceImpl.sayHello1()
    }

    @Override
    public String sayHello2() {
        //public String com.hanxiao.pointcut_expression.service.UserServiceImpl.sayHello2()
        return null;
    }

    @Override
    public com.hanxiao.pointcut_expression.bean.User sayhello3() {
        //public com.hanxiao.pointcut_expression.service.bean.User com.hanxiao.pointcut_expression.service.UserServiceImpl.sayHello3()
        return null;
    }

    @Override
    public String sayHello4(String param) {
        //public String com.hanxiao.pointcut_expression.service.UserServiceImpl.sayHello4(String)
        return null;
    }

    @Override
    public String sayHello5(String param1, String param2) {
        //public String com.hanxiao.pointcut_expression.service.UserServiceImpl.sayHello5(String, String)
        return null;
    }

    @CountTime
    @Override
    public String sayHello6(String param1, com.hanxiao.pointcut_expression.bean.User param2) {
        //public String com.hanxiao.pointcut_expression.service.UserServiceImpl.sayHello6(String, com.hanxiao.pointcut_expression.bean.User)
        return null;
    }
}
