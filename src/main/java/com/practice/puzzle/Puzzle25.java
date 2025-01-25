package com.practice.puzzle;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 17-01-2025
 */
public class Puzzle25 {
    public static void main(String[] args) {

        String input = "I am fullstack developer";

        // Split the string into words
        String[] words = input.split("\\s+");

        // Sort words by their lengths in descending order
        Arrays.sort(words, Comparator.comparingInt(String::length).reversed());

        // Get the second largest word
        String secondLargestWord = words.length > 1 ? words[1] : null;

        if (secondLargestWord != null) {
            System.out.println("The second largest word is: " + secondLargestWord);
        } else {
            System.out.println("The input does not have enough distinct words.");
        }
        getSecondLargestWord(input);
    }

    public static void getSecondLargestWord(String input) {
        String[] words = input.split("\\s+");
        Map<Integer, List<String>> collect =
                Arrays.stream(words).collect(Collectors.groupingBy(x -> x.length()));

        Map<Integer, List<String>> collect1 = collect
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (x1,x2) -> x1, LinkedHashMap::new));

        if(collect1.size() > 1) {
            System.out.println(collect1.get(collect1.keySet().stream().skip(1).findFirst().orElse(0)));
        } else {
            System.out.println("The input does not have enough distinct words.");
        }



//        Map<Integer, String> collect1 = collect
//                .entrySet()
//                .stream()
//                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
//                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (integer, integer2) -> integer,
//                        LinkedHashMap::new));


        System.out.println(collect1);
    }
}
