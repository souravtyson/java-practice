package com.practice.puzzle;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Write a program to compute the frequency of each word in a list of strings.
 */
public class Puzzle23 {
    public static void main(String[] args) {
        Puzzle23 puzzle23 = new Puzzle23();
        System.out.println(puzzle23.getWordFrequency(new String[]{"hello", "world", "java", "programming", "sourav", "suman", "hello", "world", "java", "programming", "sourav", "suman", "hello", "world", "java", "programming", "sourav", "suman"}));
    }

    private Map<String, Long> getWordFrequency(String[] s) {
        return Arrays.asList(s)
                .stream()
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));
    }
}
