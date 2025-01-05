package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Given a list of strings, write a program to filter strings with a length greater than 5 and collect them into a new list.
 */
public class Puzzle16 {
    public static void main(String[] args) {
        Puzzle16 puzzle16 = new Puzzle16();
        System.out.println(puzzle16.getWordsWithLengthGreaterThan5(new String[]{"hello", "world", "java", "programming"}));
        System.out.println(puzzle16.getWordsWithLengthGreaterThan5(new String[]{"hello", "world", "java", "programming", "sourav"}));
        System.out.println(puzzle16.getWordsWithLengthGreaterThan5(new String[] {"hello", "world", "stream", "java", "programming", "filter", "collect"}));
    }

    private List<String> getWordsWithLengthGreaterThan5(String[] strings) {
        return Arrays.asList(strings).stream().filter(word -> word.length() > 5).collect(Collectors.toList());
    }
}
