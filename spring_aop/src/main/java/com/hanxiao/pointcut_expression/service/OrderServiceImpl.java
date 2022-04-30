package com.hanxiao.pointcut_expression.service;

import com.hanxiao.pointcut_expression.anno.CountTime;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/30
 **/

public class OrderServiceImpl implements com.hanxiao.pointcut_expression.service.OrderService {
    @CountTime
    @Override
    public void goodbye() {

    }
}
