package com.practice.puzzle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */

/*
Given a list of integers, write a program to partition them into two lists: one with even numbers and another with odd numbers.
 */
public class Puzzle18 {
    public static void main(String[] args) {
        Puzzle18 puzzle18 = new Puzzle18();
        puzzle18.getEvenAndOddNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        puzzle18.getEvenAndOddNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20});
    }

    private void getEvenAndOddNumbers(int[] arrs) {
        Map<Boolean, List<Integer>> collect = Arrays.stream(arrs).boxed().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println("Even number : " + collect.getOrDefault(true, Collections.emptyList()));
        System.out.println("Odd number : " + collect.getOrDefault(false, Collections.emptyList()));
    }


}
