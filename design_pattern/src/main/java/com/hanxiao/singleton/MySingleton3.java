package com.hanxiao.singleton;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class MySingleton3 {
    private static MySingleton3 mySingleton = new MySingleton3();

    private MySingleton3() {

    }
    public static MySingleton3 getInstance() {
        return mySingleton;
    }
}
