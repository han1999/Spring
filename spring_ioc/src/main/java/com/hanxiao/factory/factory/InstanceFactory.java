package com.hanxiao.factory.factory;

import com.hanxiao.factory.bean.User;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class InstanceFactory {
    public User create() {
        User user = new User();
        user.setFromFactory("instanceFactory");
        return user;
    }
}
