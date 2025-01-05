package com.practice.puzzle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Write a program to flat map a list of lists into a single list and sort the resulting list in ascending order.
 */
public class Puzzle20 {
    public static void main(String[] args) {
        Puzzle20 puzzle20 = new Puzzle20();
        System.out.println(puzzle20.getSortedFlatList(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(puzzle20.getSortedFlatList(new int[][]{{4, 5, 6},{1, 2, 3},  {7, 8, 9}, {10, 11, 12}}));
    }

    private List<Integer> getSortedFlatList(int[][] arrs) {
        return Arrays.stream(arrs).flatMapToInt(Arrays::stream).boxed().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
    }
}
