package com.practice.puzzle;

/*
Write a function to find the majority element in an array. The majority element is the element that appears more
than n/2 times in the array (where n is the size of the array). Assume that the input array always contains a majority element.

Input: [3, 2, 3]
Output: 3

Input: [2, 2, 1, 1, 1, 2, 2]
Output: 2

 */


import java.util.HashMap;
import java.util.Map;

public class Puzzle8 {

    public static void main(String[] args) {
        System.out.println(findMajorityElement(new int[]{3, 2, 3}));
        System.out.println(findMajorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    public static int findMajorityElement(int[] arr) {
        Map<Integer, Integer> occurrence = new HashMap<>();
        int element = 0;
        for (int i : arr) {
            if (occurrence.containsKey(i)) {
                occurrence.put(i, occurrence.get(i) + 1);
            } else {
                occurrence.put(i, 1);
            }
            if (occurrence.get(i) > (arr.length / 2)) {
                element = i;
                break;
            }
        }
        return element;
    }
}
