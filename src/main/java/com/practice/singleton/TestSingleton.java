package com.practice.singleton;

/**
 * @author Sourav Suman - 01-12-2024
 */
public class TestSingleton {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        singleton1.perform();

        Singleton singleton2 = Singleton.INSTANCE;
        singleton2.perform();

        System.out.println(singleton1.hashCode() == singleton2.hashCode());

    }
}
