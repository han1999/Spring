package com.hanxiao.singleton;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class MySingleton2 {
    private static MySingleton2 mySingleton;

    private MySingleton2() {

    }

    public synchronized static MySingleton2 getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton2();
        }
        return mySingleton;
    }
}
