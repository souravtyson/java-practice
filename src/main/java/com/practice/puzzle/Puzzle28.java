package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 28-01-2025
 */
/*
Write a method to group a list of strings by their starting letter.
The result should be a map where the keys are the starting letters, and the
values are lists of strings that start with that letter.

private Map<Character, List<String>> groupByStartingLetter(List<String> words)

Example Input:
["apple", "apricot", "banana", "blueberry", "cherry", "cranberry"]

Expected Output:
{
    a=[apple, apricot],
    b=[banana, blueberry],
    c=[cherry, cranberry]
}

 */
public class Puzzle28 {

    public static void main(String[] args) {
        Puzzle28 puzzle28 = new Puzzle28();
        System.out.println(puzzle28.groupByStartingLetter(Arrays.asList("apple", "apricot", "banana", "blueberry", "cherry", "cranberry")));
    }

    private Map<Character, List<String>> groupByStartingLetter(List<String> words) {
        return words.stream().collect(Collectors.groupingBy(x -> x.charAt(0)));
    }

}
