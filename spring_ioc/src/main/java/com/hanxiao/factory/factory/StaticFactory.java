package com.hanxiao.factory.factory;

import com.hanxiao.factory.bean.User;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class StaticFactory {
    public static User create() {
        User user = new User();
        user.setFromFactory("staticFactory");
        return user;
    }
}
