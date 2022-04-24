package com.hanxiao.singleton;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class MySingleton4 {
    private static MySingleton4 mySingleton;

    static {
        mySingleton = new MySingleton4();
    }
    private MySingleton4() {

    }
    public static MySingleton4 getInstance() {
        return mySingleton;
    }
}
