package com.practice.puzzle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Given a list of integers, sort them in descending order using the Stream API.
 */
public class Puzzle13 {
    public static void main(String[] args) {
        Puzzle13 puzzle13 = new Puzzle13();
        System.out.println(puzzle13.sortDescending(new int[]{2, 1, 5, 6, 3, 4, 9, 20, 21}));
        System.out.println(puzzle13.sortDescending(new int[]{2, 1, 5, 6, 3, 4, 9, 20, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}));
    }

    private List<Integer> sortDescending(int[] arrs) {
        return Arrays.stream(arrs).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
    }
}
