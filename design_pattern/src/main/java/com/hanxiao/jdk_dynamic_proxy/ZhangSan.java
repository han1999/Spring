package com.hanxiao.jdk_dynamic_proxy;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/25
 **/

public class ZhangSan implements Interface1 {
    @Override
    public void buyBreakfast() {
        System.out.println("张三买了一个火腿肠！");
    }

    @Override
    public void sayHello() {
        System.out.println("张三见到学姐，热情地打了招呼！");
    }
}
