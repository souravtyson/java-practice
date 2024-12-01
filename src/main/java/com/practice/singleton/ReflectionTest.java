package com.practice.singleton;

import java.lang.reflect.Constructor;

/**
 * @author Sourav Suman - 01-12-2024
 */
public class ReflectionTest {

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.INSTANCE;
        try {
            Constructor<?>[] declaredConstructors = Singleton.class.getDeclaredConstructors();

            for(Constructor<?> constructor : declaredConstructors) {
                constructor.setAccessible(true);
                Singleton singleton2 = (Singleton) constructor.newInstance();
                singleton2.perform();
            }

        } catch(Exception ex) {
            System.out.println("Exception ocured while getting instance using reflection " + ex.getMessage());
        }

        singleton1.perform();
    }
}
