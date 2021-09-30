package com.joy.desingmode.factory.abs;

public interface CarFactory {
    //生成不同型号的汽车 ，两条产品线
    public MiniCar produceMiniCar();

    public SUVCar produceSUVCar();
}