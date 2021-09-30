package com.joy.desingmode.factory.statistic;

/***
 * 电脑工厂类1：静态方法实现
 */
public class ComputerFactory2 {
    public static Computer produce(String type) {
        Computer computer = null;
        if (type.equals("note")) {
            computer = new ComputerNote();
        } else if (type.equals("person")) {
            computer = new ComputerPerson();
        }
        return computer;
    }
}
