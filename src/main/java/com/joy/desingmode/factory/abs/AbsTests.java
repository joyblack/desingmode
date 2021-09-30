package com.joy.desingmode.factory.abs;

public class AbsTests {
    public static void main(String[] args) {
        //创建宝马迷你汽车  找工厂
        CarFactory factory = new BMWCarFactory();
        MiniCar car = factory.produceMiniCar();
        car.show();

        SUVCar suvCar = factory.produceSUVCar();
        suvCar.show();
    }
}
