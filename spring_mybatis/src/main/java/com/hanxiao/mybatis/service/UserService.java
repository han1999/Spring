package com.hanxiao.mybatis.service;

import com.hanxiao.mybatis.bean.User;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/

public interface UserService {
    User selectUserByPrimaryKey(Integer id);

}
