package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 01-12-2024
 */
public class Puzzle1 {
    /*
    Write a function to find the missing number in an array containing integers from 1 to n.
    The array has exactly one missing number. The numbers are not sorted, and no duplicates exist.
    Input: [3, 7, 1, 2, 8, 4, 5] (n = 8)
    Output: 6

    Input: [1, 2, 4, 6, 3, 7, 8] (n = 8)
    Output: 5
     */

    public static void main(String[] args) {
        Puzzle1 puzzle1 = new Puzzle1();
        Integer[] arr = {3,7,1,2,8,4,5};
        System.out.println(puzzle1.findMissingNumber(arr, 8));
        int[] arr2 = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(puzzle1.findMissingNumber(arr2, 8));
        System.out.println(puzzle1.findMissingNumber(new int[]{3, 7, 1, 2, 8, 4, 5}, 8)); // Output: 6
        System.out.println(puzzle1.findMissingNumber(new int[]{1, 2, 4, 6, 3, 7, 8}, 8)); // Output: 5
        System.out.println(puzzle1.findMissingNumber(new int[]{2}, 2)); // Output: 1
        System.out.println(puzzle1.findMissingNumber(new int[]{}, 1)); // Output: 1

    }

    public int findMissingNumber(int[] arr, int num) {
        int sum = (num * (num + 1)) / 2;
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        Integer reduce = list.stream().reduce(0, (i,j) -> {
            return i + j;
        });

        return sum - reduce;
    }

    public int findMissingNumber(Integer[] arr, int num) {
        int sum = (num * (num + 1)) / 2;
        List<Integer> list = Arrays.asList(arr);

        Integer reduce = list.stream().reduce(0, (i,j) -> {
            return i + j;
        });

        return sum - reduce;
    }
}
