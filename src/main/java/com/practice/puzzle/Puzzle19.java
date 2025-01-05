package com.practice.puzzle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

/**
 * @author Sourav Suman - 05-01-2025
 */

/*
Using the Stream API, find the second largest number in a list of integers.
 */
public class Puzzle19 {
    public static void main(String[] args) {
        Puzzle19 puzzle19 = new Puzzle19();
        System.out.println(puzzle19.findSecondLargest(new int[]{2, 1, 5, 6, 3, 4, 9, 20, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}));
        System.out.println(puzzle19.findSecondLargest(new int[]{2, 1, 5, 6, 3, 4, 9, 20, 21}));
    }

    private Integer findSecondLargest(int[] arrs) {
        Optional<Integer> optionalInteger = Arrays.stream(arrs).boxed().sorted(Comparator.reverseOrder()).skip(1).findFirst();
        return optionalInteger.orElse(-1);
    }

}
