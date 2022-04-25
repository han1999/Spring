package com.hanxiao.jdk_dynamic_proxy;

import java.lang.reflect.Proxy;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/25
 **/

public class GenerateProxyInstance {
    public static void main(String[] args) {
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ZhangSan zhangSan = new ZhangSan();
        Interface1 proxy = (Interface1) Proxy.newProxyInstance(zhangSan.getClass().getClassLoader(),
                zhangSan.getClass().getInterfaces(),
                (proxy1, method, args1) -> {
                    Object invoke = method.invoke(zhangSan, args1);
                    System.out.println("增强了这个方法" + method.getName());
                    return invoke;
                });
        proxy.buyBreakfast();
        proxy.sayHello();
    }
}
