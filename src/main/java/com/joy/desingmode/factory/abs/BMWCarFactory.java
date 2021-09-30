package com.joy.desingmode.factory.abs;

public class BMWCarFactory implements  CarFactory {
    // 生成迷你汽车的方法，返回MiniCar
    @Override
    public MiniCar produceMiniCar() {
        return new BMWMiniCar();
    }
    //生成SUV汽车的方法， 返回SUVCar
    @Override
    public SUVCar produceSUVCar() {
        return new BMWSUVCar();
    }
}