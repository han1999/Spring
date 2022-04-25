package com.hanxiao.singleton;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class MySingleton5 {
    private MySingleton5() {

    }

    private static MySingleton5 mySingleton5;

    public static MySingleton5 getInstance() {
        return Inner.get();
    }

    static class Inner{
        static{
            mySingleton5 = new MySingleton5();
        }

        public static MySingleton5 get() {
            return mySingleton5;
        }
    }
}
