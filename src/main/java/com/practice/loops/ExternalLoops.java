package com.practice.loops;

import java.util.Arrays;
import java.util.List;

public class ExternalLoops {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(1,2,3,4,5,7,3);
        // normal for loop
        for(int i=0;i<data.size(); i++){
            System.out.println(data.get(i));
        }
        System.out.println("----------------------------");
        // enhanced for loop
        for (Integer integer : data) {
            System.out.println(integer);
        }
    }
}
