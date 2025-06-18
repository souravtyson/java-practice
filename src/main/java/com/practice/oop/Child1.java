package com.practice.oop;

/**
 * @author Sourav Suman - 18-02-2025
 */
public class Child1 extends Parent1{

    public static void main(String[] args) {
        Child1 c = new Child1();
        c.throwNullPointer();
    }

    @Override
    public void throwNullPointer() throws RuntimeException{
        System.out.println("child");
    }
}
// sqs sns lambdda s3 api gateway