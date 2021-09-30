package com.joy.desingmode.factory.method;

/**
 * 生产宝马车的工厂类
 */
public class BMCarFactory implements CarFactory {
    @Override
    public Car produce() {
        return new BMCar();
    }
}
