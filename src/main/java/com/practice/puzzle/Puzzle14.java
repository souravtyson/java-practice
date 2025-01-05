package com.practice.puzzle;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Write a program to find the first element in a list of integers that is greater than 50. If no such element exists, return -1.
 */
public class Puzzle14 {
    public static void main(String[] args) {
        Puzzle14 puzzle14 = new Puzzle14();
        System.out.println(puzzle14.getFirstElementGreaterThan50(new int[]{10, 20, 30, 40, 60, 70, 80, 90, 100}));
        System.out.println(puzzle14.getFirstElementGreaterThan50(new int[]{10, 20, 30, 40, 60, 70, 80, 90, 100, 51}));
        System.out.println(puzzle14.getFirstElementGreaterThan50(new int[]{1,2,4,34,23,12}));
    }

    private int getFirstElementGreaterThan50(int[] arrs) {
        Optional<Integer> first = Arrays.stream(arrs).boxed().filter(x -> x > 50).findFirst();
        return first.orElse(-1);
    }
}
