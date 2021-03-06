package com.hanxiao.mybatis;

import com.hanxiao.mybatis.bean.User;
import com.hanxiao.mybatis.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class ProxyTest {
    @Autowired
    UserService userService;

    @Test
    public void testProxy() {
        User user = userService.selectUserByPrimaryKey(1);
        user.setId(null);
        Integer integer = userService.insertUser(user);
    }
}
