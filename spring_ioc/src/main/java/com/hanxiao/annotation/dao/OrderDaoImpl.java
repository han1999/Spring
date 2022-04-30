package com.hanxiao.annotation.dao;

import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/29
 **/
@Repository
public class OrderDaoImpl implements OrderDao {
    @Override
    public void order() {
        System.out.println("下单！！！");
    }
}
