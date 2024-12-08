package com.practice.puzzle;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Sourav Suman - 02-12-2024
 */
public class Puzzle3 {

    /*
    Write a function to find the first repeating character in a string. If no characters repeat, return null.
    Input: "programming"
    Output: "r"

    Input: "abc"
    Output: null
     */

    public static void main(String[] args) {
        System.out.println(findFirstRepeatingCharacter("programming"));
        System.out.println(findFirstRepeatingCharacter("abc"));
        System.out.println(findFirstRepeatingCharacter("aabbcc"));
        System.out.println(findFirstRepeatingCharacter(""));
    }

    public static String findFirstRepeatingCharacter(String input) {
        char[] ch = input.toCharArray();
        Map<Character, Integer> freq = new HashMap<>();

        for(char c : ch) {
            if(freq.containsKey(c)) {
                freq.put(c, freq.get(c) + 1);
                return c + "";
            } else {
                freq.put(c, 1);
            }
        }
        return null;
    }
}
