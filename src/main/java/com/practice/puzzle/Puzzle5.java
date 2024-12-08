package com.practice.puzzle;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author Sourav Suman - 03-12-2024
 */
public class Puzzle5 implements Comparator<Integer> {
    /*
    Write a function to merge two sorted arrays into a single sorted array without using any sorting function.
    Input: [1, 3, 5], [2, 4, 6]
    Output: [1, 2, 3, 4, 5, 6]

    Input: [0, 10], [3, 7, 15]
    Output: [0, 3, 7, 10, 15]
     */

    public static void main(String[] args) {
        System.out.println(Arrays.asList(getMergedSortedArray(new Integer[]{1, 3, 5}, new Integer[]{2,4,6})));
        System.out.println(Arrays.asList(getMergedSortedArray(new Integer[] {0,10}, new Integer[] {3,7,15})));
        System.out.println(Arrays.asList(getMergedSortedArray(new Integer[] {1, 3, 5, 7}, new Integer[] {2, 4, 6, 8})));

    }

    static Integer[] getMergedSortedArray(Integer[] arr1, Integer[] arr2) {
        Integer[] merged = new Integer[arr1.length + arr2.length];
        for (int i=0;i<arr1.length;i++) {
            merged[i] = arr1[i];
        }
        for (int j=0;j< arr2.length;j++) {
            merged[arr1.length + j] = arr2[j];
        }
        Arrays.sort(merged, new Puzzle5());
        return merged;
    }

    @Override
    public int compare(Integer o1, Integer o2) {
        if(o1 > o2) {
            return 1;
        }
        if (o1 < o2) {
            return -1;
        }
        return 0;
    }
}
