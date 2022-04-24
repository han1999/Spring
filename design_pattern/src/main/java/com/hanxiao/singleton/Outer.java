package com.hanxiao.singleton;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class Outer {
    public static void noInvokeInnerMethod() {
        System.out.println("没有调用静态内部类的方法");
    }

    public static void invokeInnerMethod() {
        System.out.println("调用到静态内部类的方法");
        Inner.innerMethod();
    }

    static class Inner {
        static {
            System.out.println("静态内部类中的静态代码块");
        }

        public static void innerMethod() {
            System.out.println("静态内部类中的静态方法");
        }
    }
}
