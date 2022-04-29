package com.hanxiao.factory.factory;

import com.hanxiao.factory.bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/28
 **/

public class UserFactoryBean implements FactoryBean<User> {

    @Override
    public User getObject() throws Exception {
        User user = new User();
        user.setFromFactory("factoryBean");
        return user;
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
