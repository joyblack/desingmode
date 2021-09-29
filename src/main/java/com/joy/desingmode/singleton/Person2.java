package com.joy.desingmode.singleton;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 饿单例模式：该模式在类加载时就会创建对象
 */
@Data
@Slf4j
public class Person2 {
    private String name;
    private Integer age;

    // 1.私有化静态变量
    private static Person2 INSTANCE = new Person2();

    // 2.私有化构造方法
    private Person2() {
        log.info("hungry first loaded...");
        this.name = "SunRun";
        this.age = 24;
    }

    // 3. 提供一个静态方法，并返回该类的对象
    public static Person2 getInstance() {
        if (INSTANCE == null) {
            log.info("hungry instance null visited...");
            INSTANCE = new Person2();
        }
        return INSTANCE;
    }
}
