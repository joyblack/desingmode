package com.joy.desingmode.factory.method;

public class CarTest {
    public static void main(String[] args) {
        // 先创建工厂类
        CarFactory factory = new BMCarFactory();
        Car car = factory.produce();
        car.show();

        // 这个模式对于同一级别的产品，可扩展性高，可以扩展不同品牌的汽车，此时不需要修改代码，只需要增加代码即可，创建一个新的品牌汽车  大众汽车
        /**
         *  CarFactory dzFactory = new DZCarFactory();
         *  Car car = dzFactory.produce();
         *  car.show();
         */
        factory = new AudiCarFactory();
        car = factory.produce();
        car.show();
    }
}
