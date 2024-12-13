package com.practice.multipleinheritance;

public class Test1 implements TestI {
    public static void main(String[] args) {
        new Test1().m1();

        new Test1().m2(); // inside static method

        new Test1().hello();
    }

    @Override
    public void m1() {
        System.out.println("inside m1 of Test1");
    }

    public void hello() {
        TestI.super.m2(); // inside non static method
    }
}
