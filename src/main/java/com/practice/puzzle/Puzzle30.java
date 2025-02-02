package com.practice.puzzle;

import java.util.Arrays;

/**
 * @author Sourav Suman - 28-01-2025
 */

/*
Write a method that takes a list of integers and returns a list of integers that are divisible by 3 but not by 5.
private List<Integer> getDivisibleBy3Not5(List<Integer> numbers)

Example Input:
[3, 5, 9, 12, 15, 18, 20, 30]

Expected Output:
[3, 9, 12, 18]

 */
public class Puzzle30 {
    public static void main(String[] args) {
        Puzzle30 puzzle30 = new Puzzle30();
        int[] divisibleBy3Not5 = puzzle30.getDivisibleBy3Not5(new int[]{3, 5, 9, 12, 15, 18, 20, 30});
        for (int i : divisibleBy3Not5) {
            System.out.print(i+" ");
        }

    }

    private int[] getDivisibleBy3Not5(int[] arr) {
        return Arrays.stream(arr).filter(x -> (x % 3 == 0) && (x % 5 != 0)).toArray();
    }
}
