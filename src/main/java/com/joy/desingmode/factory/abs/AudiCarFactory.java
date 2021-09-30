package com.joy.desingmode.factory.abs;

public class AudiCarFactory implements  CarFactory {
    @Override
    public MiniCar produceMiniCar() {
        return new AudiMiniCar();
    }

    @Override
    public SUVCar produceSUVCar() {
        return new AudiSUVCar();
    }
}