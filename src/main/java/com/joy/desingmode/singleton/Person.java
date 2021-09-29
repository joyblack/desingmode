package com.joy.desingmode.singleton;

import lombok.Data;

/**
 * 懒单例模式：该模式只会在使用之后才会创建对象
 */
@Data
public class Person {
    private String name;
    private Integer age;

    // 1.私有化静态变量
    private static Person INSTANCE = null;

    // 2.私有化构造方法
    private Person() {
        this.name = "懒单例";
        this.age = 27;
    }

    // 3. 提供一个静态方法，并返回该类的对象
    public static Person getInstance() {
        if (INSTANCE == null) {
            // First visit
            INSTANCE = new Person();
        }
        return INSTANCE;
    }
}
