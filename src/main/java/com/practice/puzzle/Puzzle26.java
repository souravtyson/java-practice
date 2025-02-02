package com.practice.puzzle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sourav Suman - 28-01-2025
 */

/*
Write a method to find the longest word in a list of strings. If there are multiple words with the same maximum length, return the first one that appears in the list.
private String findLongestWord(List<String> words)
i/p - ["apple", "banana", "cherry", "date", "elderberry", "fig", "grape"]
o/p - "elderberry"
 */

public class Puzzle26 {

    public static void main(String[] args) {
        Puzzle26 puzzle26 = new Puzzle26();
        String[] s =  {"apple", "banana", "cherry", "elderberry", "date", "fig", "grape"};
        System.out.println(puzzle26.findLongestWord(Arrays.asList(s)));
    }

    private String findLongestWord(List<String> words) {
        words.sort(Comparator.comparing(String::length).reversed());
        return !words.isEmpty() ? words.get(0) : "";
    }

    // AI solution -
    private String findLongestWord(List<String> words, String ai) {
        return words.stream()
                .max(Comparator.comparing(String::length))
                .orElse(""); // Handles the empty list case
    }

}
