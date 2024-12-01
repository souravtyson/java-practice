package com.practice.functional.IF;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        CalculateSum x = (a, b) -> a + b;

        System.out.println(x.sum(1,2));
    }
 }