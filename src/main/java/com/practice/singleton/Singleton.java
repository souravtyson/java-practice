package com.practice.singleton;

/**
 * @author Sourav Suman - 01-12-2024
 */

public enum Singleton {

    // Three ways to break singleton.
    /*
    1. Using Reflection
    2. Using Clone
    3. Using Serialization
    But using enum way of creating singleton we cannot break using above method
     */

    INSTANCE;

    public void perform() {
        System.out.println("The hash code value is " + this.hashCode());
    }

}
