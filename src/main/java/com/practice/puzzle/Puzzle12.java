package com.practice.puzzle;

import java.util.Arrays;

/**
 * @author Sourav Suman - 05-01-2025
 */

/*
Use the Stream API to count how many elements in a list are greater than 10.
 */
public class Puzzle12 {
    public static void main(String[] args) {
        Puzzle12 puzzle12 = new Puzzle12();
        System.out.println(puzzle12.getCountOfElementsGreaterThanTen(new int[]{2, 1, 5, 6, 3, 4, 9, 20, 21}));
        System.out.println(puzzle12.getCountOfElementsGreaterThanTen(new int[]{2, 1, 5, 6, 3, 4, 9, 20, 21, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30}));

    }

    private long getCountOfElementsGreaterThanTen(int[] arr) {
        return Arrays.stream(arr).boxed().filter(x -> x > 10).count();

        // you can remove boxed as count will not require it
    }
}
