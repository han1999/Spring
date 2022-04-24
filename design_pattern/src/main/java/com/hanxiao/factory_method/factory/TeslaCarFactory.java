package com.hanxiao.factory_method.factory;

import com.hanxiao.factory_method.bean.Car;
import com.hanxiao.factory_method.bean.TeslaCar;

/**
 * @description:
 * @author: Han Xiao
 * @date: 2022/4/24
 **/

public class TeslaCarFactory implements CarFactory {

    @Override
    public Car create() {
        return new TeslaCar();
    }
}
