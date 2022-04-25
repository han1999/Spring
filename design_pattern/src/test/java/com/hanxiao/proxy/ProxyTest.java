package com.hanxiao.proxy;

import org.junit.Test;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class ProxyTest {
    @Test
    public void testProxy() {
        ZhangSan zhangSan = new ZhangSan();
        zhangSan.buyBreakfast();
    }

    @Test
    public void testProxy2() {
        LiSi liSi = new LiSi();
        liSi.buyBreakfast();
    }

    @Test
    public void testProxy3() {

        LiSi2 liSi2 = new LiSi2();
        liSi2.buyBreakfast();

    }
}
