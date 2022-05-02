package com.hanxiao.mapper;

import org.apache.ibatis.annotations.Param;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/5/1
 **/

public interface AccountMapper {
    Integer selectMoneyById(Integer id);

    Integer updateMoneyById(@Param("money") Integer money, @Param("id") Integer id);
}
