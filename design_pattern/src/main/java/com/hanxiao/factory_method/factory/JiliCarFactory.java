package com.hanxiao.factory_method.factory;

import com.hanxiao.factory_method.bean.Car;
import com.hanxiao.factory_method.bean.JiliCar;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class JiliCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new JiliCar();
    }
}
