package com.hanxiao.mybatis_in_spring.service;


import com.hanxiao.mybatis_in_spring.bean.User;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/

public interface UserService {
    User selectUserByPrimaryKey(Integer id);

    Integer insertUser(User user);
}
