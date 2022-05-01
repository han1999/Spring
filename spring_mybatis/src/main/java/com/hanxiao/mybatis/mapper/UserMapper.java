package com.hanxiao.mybatis.mapper;

import com.hanxiao.mybatis.bean.User;
import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/

public interface UserMapper {
    User selectByPrimaryKey(@Param("id") Integer id);

    Integer insertUser(User user);
}
