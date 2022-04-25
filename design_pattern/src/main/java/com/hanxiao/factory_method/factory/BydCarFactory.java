package com.hanxiao.factory_method.factory;

import com.hanxiao.factory_method.bean.BydCar;
import com.hanxiao.factory_method.bean.Car;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class BydCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new BydCar();
    }
}
