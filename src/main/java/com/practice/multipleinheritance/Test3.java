package com.practice.multipleinheritance;

public class Test3 implements TestI {
    public static void main(String[] args) {
        new Test3().m4();
        new Test3().hello();
    }

    @Override
    public void m1() {

    }

    public void hello() {
        TestI.super.m4();
    }

    @Override
    public void m4() {
        System.out.println("inside m4 method of Test3 class");
    }
}
