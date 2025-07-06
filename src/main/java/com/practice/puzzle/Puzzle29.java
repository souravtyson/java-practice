package com.practice.puzzle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 28-01-2025
 */
/*
Write a method to find the first non-repeated character in a string. If all characters are repeated, return null.

private Character findFirstNonRepeatedCharacter(String str)

Example Input:
"swiss"

Expected Output:
"w"

 */
public class Puzzle29 {

    public static void main(String[] args) {
        Puzzle29 puzzle29 = new Puzzle29();
        System.out.println(puzzle29.findFirstNonRepeatedCharacter("swiss"));
    }

    private Character findFirstNonRepeatedCharacter(String str) {
        LinkedHashMap<Character, Long> collect = str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        return str.chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(u -> u.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse(null);

    }

}

