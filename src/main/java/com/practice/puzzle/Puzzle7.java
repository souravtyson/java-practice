package com.practice.puzzle;

/**
 * @author Sourav Suman - 05-12-2024
 */
/*
Write a function to check if a given string is a palindrome.
A palindrome reads the same forward and backward, ignoring spaces, capitalization, and punctuation.
Input: "A man, a plan, a canal, Panama"
Output: true

Input: "hello"
Output: false
 */
public class Puzzle7 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println(isPalindrome("Hello"));
    }

    static boolean isPalindrome(String s) {
        String p = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(p).reverse();
        return sb.toString().equals(p);
    }
}
