package com.hanxiao.factory.factory;

import com.hanxiao.factory.bean.BydCar;
import com.hanxiao.factory.bean.Car;
import com.hanxiao.factory.bean.JiliCar;
import com.hanxiao.factory.bean.TeslaCar;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class CarFactory {
    public Car createCar(String name) {
        if ("BydCar".equals(name)) {
            return new BydCar();
        } else if ("JiliCar".equals(name)) {
            return new JiliCar();
        } else if ("TeslaCar".equals(name)) {
            return new TeslaCar();
        }
        return null;
    }
}
