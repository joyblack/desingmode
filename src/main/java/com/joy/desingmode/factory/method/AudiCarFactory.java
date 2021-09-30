package com.joy.desingmode.factory.method;

/**
 * 生产奥迪车的工厂类
 */
public class AudiCarFactory implements CarFactory {
    @Override
    public Car produce() {
        return new AudiCar();
    }
}
