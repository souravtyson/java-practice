package com.practice.multipleinheritance;

public class Test2 implements TestI {
    @Override
    public void m1() {

    }

    @Override
    public void m3() {
        TestI.super.m3();
    }
}
