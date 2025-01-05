package com.practice.puzzle;

import java.util.Arrays;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Create a Stream pipeline to compute the sum of squares of all odd numbers in a list.
 */
public class Puzzle15 {
    public static void main(String[] args) {
        Puzzle15 puzzle15 = new Puzzle15();
        System.out.println(puzzle15.sumOfSquaresOfOddNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println(puzzle15.sumOfSquaresOfOddNumbers(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}));
    }

    private long sumOfSquaresOfOddNumbers(int[] arrs) {
        return Arrays.stream(arrs).boxed().filter(x -> x % 2 != 0).map(x -> x * x).reduce(0, (a,b) -> a + b );
    }
}
