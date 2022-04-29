package com.hanxiao.annotation.service;

import com.hanxiao.annotation.dao.OrderDao;
import com.hanxiao.annotation.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;


/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/
@Component
public class UserServiceImpl implements UserService {
    @Autowired
    @Qualifier("userDaoImpl")
    UserDao userDao;

    @Resource(name = "userDaoImpl2")//Resource 注解 来自javax而不是Spring好家伙
            UserDao userDao2;

    @Autowired
    OrderDao orderDao;

    @Value("${param.username}")
    private String username;

    @Override
    public void sayHello() {
        userDao.sayHello();
        userDao2.sayHello();
        orderDao.order();
    }
}
