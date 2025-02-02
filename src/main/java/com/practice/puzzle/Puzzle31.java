package com.practice.puzzle;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 28-01-2025
 */
public class Puzzle31 {
    public static void main(String[] args) {

        /*
        Write a method that takes a list of strings and returns a
        map where the key is the first character of each string, and the value is a list
        of strings that start with that character.
         */
        String[] arr = {"apple", "banana", "cherry", "avocado", "blueberry", "chocolate"};
        Map<Character, List<String>> collect = Arrays.stream(arr).collect(Collectors.groupingBy(x -> x.charAt(0)));
        System.out.println(collect);

        /*
        Write a method that takes a list of integers and returns the sum of the
        squares of all the even numbers in the list.
         */

        int[] arr1 = {1, 2, 3, 4, 5, 6};

        int reduce = Arrays.stream(arr1)
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .reduce(0, (x1, x2) -> (x1 + x2));
        System.out.println(reduce);

        /*
        Write a method that takes a list of strings and returns a list
        of strings that contain at least one vowel (a, e, i, o, u).
         */

        String[] arr2 = {"apple", "sky", "banana", "rhythm", "orange", "grape"};
        String regex = "[aeiouAEIOU]";
        Pattern p = Pattern.compile(regex);

        List<String> collect1 =
                Arrays.asList(arr2).stream().filter(str -> p.matcher(str).find()).collect(Collectors.toList());

        System.out.println(collect1);

        /*
        Write a method that takes a list of integers and returns the third largest unique number. If there are fewer than three unique numbers, return -1.
         */

        int[] intArr = {10, 20, 20, 30, 40, 50};
        Integer i = Arrays.stream(intArr).boxed().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElse(-1);
        System.out.println(i);

    }
}
