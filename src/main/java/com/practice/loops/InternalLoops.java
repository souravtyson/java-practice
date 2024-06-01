package com.practice.loops;

import java.util.Arrays;
import java.util.List;

public class InternalLoops {

    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,3,2,5,4,7,6);
        data.forEach(x -> System.out.println(x));
        System.out.println("*********************");
        data.forEach(System.out::println);
    }
}
