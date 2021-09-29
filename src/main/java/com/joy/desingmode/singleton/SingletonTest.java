package com.joy.desingmode.singleton;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SingletonTest {
    public static void main(String[] args) {
        // 懒加载测试
        Person person = Person.getInstance();
        log.info("lazy singleton：{}", person);

        // 饿加载测试
        Person2 person2 = Person2.getInstance();
        log.info("hungry singleton：{}", person2);

        // 线程安全
        Person3 person3 = Person3.getInstance();
        log.info("safe singleton：{}", person3);
    }
}
