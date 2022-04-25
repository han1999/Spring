package com.hanxiao.proxy;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class LiSi {
    private ZhangSan zhangSan = new ZhangSan();

    public void buyBreakfast() {
        zhangSan.buyBreakfast();
        System.out.println("油条");
    }
}
