package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */

/*
Write a Java program to filter a list of integers and print only the even numbers using the Stream API.
 */

public class Puzzle10 {
    public static void main(String[] args) {
        System.out.println(getEvenNumbers(new int[]{2,1,5,6,3,4,9,20,21}));
    }

    private static List<Integer> getEvenNumbers(int[] arr) {
        return Arrays.stream(arr).boxed().filter(x -> x % 2 == 0).collect(Collectors.toList());
    }
}
