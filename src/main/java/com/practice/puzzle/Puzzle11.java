package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */

/*
Given a list of strings, write a program to convert all strings to uppercase using the Stream API.
 */
public class Puzzle11 {

    public static void main(String[] args) {
        Puzzle11 puzzle11 = new Puzzle11();
        System.out.println(puzzle11.getUppercase(new String[]{"hello", "world", "java", "programming"}));
    }

    private List<String> getUppercase(String[] strings) {
        return Arrays.stream(strings).map(String::toUpperCase).collect(Collectors.toList());
    }

}
