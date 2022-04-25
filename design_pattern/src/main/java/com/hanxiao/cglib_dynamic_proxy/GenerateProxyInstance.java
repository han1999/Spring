package com.hanxiao.cglib_dynamic_proxy;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.InvocationHandler;

import java.lang.reflect.Method;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/25
 **/

public class GenerateProxyInstance {
    public static void main(String[] args) {
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "C:\\Users\\hx\\IdeaProjects\\Spring\\design_pattern");
        ZhangSan zhangSan = new ZhangSan();
        ZhangSan proxy = (ZhangSan) Enhancer.create(zhangSan.getClass(), new InvocationHandler() {
            @Override
            public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
                Object invoke = method.invoke(zhangSan, objects);
                System.out.println("增强了 " + method.getName());
                return invoke;
            }
        });
        proxy.sayHello();
    }
}
