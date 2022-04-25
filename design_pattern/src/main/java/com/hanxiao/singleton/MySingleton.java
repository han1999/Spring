package com.hanxiao.singleton;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class MySingleton {
    private static MySingleton mySingleton;

    private MySingleton() {

    }

    public static MySingleton getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton();
        }
        return mySingleton;
    }
}
