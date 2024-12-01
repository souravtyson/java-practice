package com.practice.singleton;

/**
 * @author Sourav Suman - 01-12-2024
 */
public class ThreadSafetyTest {

    public static void main(String[] args) {

        Runnable task = () -> {
            Singleton singleton = Singleton.INSTANCE;
            singleton.perform();
        };

        Thread th1 = new Thread(task, "th1");
        Thread th2 = new Thread(task, "th2");
        Thread th3 = new Thread(task, "th3");

        th1.start();
        th2.start();
        th3.start();
    }
}
