package com.hanxiao.service;

import com.hanxiao.bean.User;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/

public interface UserService {
    void sayHello1();

    String sayHello2();

    User sayhello3();

    String sayHello4(String param);

    String sayHello5(String param1, String param2);

    String sayHello6(String param1, User param2);
}
