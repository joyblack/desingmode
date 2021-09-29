package com.joy.desingmode.singleton;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * 线程安全单例模式，getInstance并非原子操作
 */
@Data
@Slf4j
public class Person3 {
    private String name;
    private Integer age;

    // 1.私有化静态变量
    private static volatile Person3 INSTANCE = null;

    // 2.私有化构造方法
    private Person3() {
        this.name = "线程安全";
        this.age = 24;
    }

    // 3. 提供一个静态方法，并返回该类的对象
    public static Person3 getInstance() {
        if (INSTANCE == null) {
            synchronized (Person3.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Person3();
                }
            }
        }
        return INSTANCE;
    }
}
