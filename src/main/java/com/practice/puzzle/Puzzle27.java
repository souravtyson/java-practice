package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 28-01-2025
 */

/*
Write a method to find all the distinct characters in a list of strings and return them as a sorted list.
private List<Character> findDistinctCharacters(List<String> words)

Example Input:
["apple", "banana", "cherry"]

Expected Output:
[a, b, c, e, h, l, n, p, r, y]
 */
public class Puzzle27 {
    public static void main(String[] args) {
        Puzzle27 puzzle27 = new Puzzle27();
        System.out.println(puzzle27.findDistinctCharacters(Arrays.asList("apple", "banana", "cherry")));
    }

    private List<Character> findDistinctCharacters(List<String> words) {
        return words
                .stream()
                .flatMap(x -> x.chars()
                        .mapToObj(y -> (char)y))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

}
