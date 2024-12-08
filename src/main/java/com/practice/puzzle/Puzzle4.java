package com.practice.puzzle;

import java.util.Arrays;

/**
 * @author Sourav Suman - 03-12-2024
 */


public class Puzzle4 {
    /*
    Write a function to find the longest common prefix among an array of strings.
    If there’s no common prefix, return an empty string.

    Input: ["flower", "flow", "flight"]
    Output: "fl"

    Input: ["dog", "racecar", "car"]
    Output: ""
     */

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flow", "flower", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
        System.out.println(longestCommonPrefix(new String[]{"interspecies", "interstellar", "interstate"})); // Output: "inters"
        System.out.println(longestCommonPrefix(new String[]{"a"})); // Output: "a"
        System.out.println(longestCommonPrefix(new String[]{""}));  // Output: ""
    }

    static String longestCommonPrefix(String[] args) {
        if (args == null || args.length == 0) {
            return ""; // Handle empty input
        }

        for(int m=0;m<args[0].length(); m++) {
            for(int n=1;n<args.length;n++) {
                if(args[n].length() <= m || args[0].charAt(m) != args[n].charAt(m)) {
                    return args[0].substring(0,m);
                }
            }
        }
        return args[0];
    }

}
