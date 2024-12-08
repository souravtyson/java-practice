package com.practice.oop;

import java.util.Arrays;

/**
 * @author Sourav Suman - 08-12-2024
 */
public class Child extends Parent{
    @Override
    public void m1() {
        System.out.println("this is child m1()");
    }

    @Override
    public void m2() {
        System.out.println("this is child m2()");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
        // if parent class method signature has throws exception, then it is not mandatory for child class overrided
        // method to have same signature.
        // but if child overrided method signature cannot have throws exception if parent method does not have throws
        // as signature. it will cause compilation issue.
        new String("sourav").intern();
        try {
            p.m2();
        } catch (Exception e) {
            e.getMessage();
        }

        Parent p1 = new Parent();
        p1.m1();


    }
}
