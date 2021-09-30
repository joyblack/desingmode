package com.joy.desingmode.factory.statistic;

public class StatisTest {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        Computer note = factory.produce("note");
        note.work();

        Computer person = ComputerFactory2.produce("person");
        person.work();

    }
}
