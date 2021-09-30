package com.joy.desingmode.factory.statistic;

/***
 * 电脑工厂类1：对象方法实现
 */
public class ComputerFactory {
    public Computer produce(String type) {
        Computer computer = null;
        if (type.equals("note")) {
            computer = new ComputerNote();
        } else if (type.equals("person")) {
            computer = new ComputerPerson();
        }
        return computer;
    }
}
