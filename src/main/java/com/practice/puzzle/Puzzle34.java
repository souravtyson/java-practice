package com.practice.puzzle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Sourav Suman - 08-02-2025
 */

public class Puzzle34 {
    public static void main(String[] args) {
        Puzzle34 puzzle34 = new Puzzle34();
        System.out.println(puzzle34.question1());
        System.out.println(puzzle34.question2());
        System.out.println(puzzle34.question3(3));
        System.out.println(puzzle34.question4(5));
    }

    public Map<Boolean, Map<String, Integer>> question1() {
        /*
        Given a list of integers, write a Java program using the Stream API to:
            Partition the numbers into two groups: even and odd .
            For each group:
                Calculate the sum of all numbers.
                Find the maximum number.
                Find the minimum number.
                Return a Map<Boolean, Map<String, Integer>> where:
                The outer map's key is a boolean (true for even numbers, false for odd numbers).
                The inner map contains three keys:
                    "sum": The sum of the numbers in the group.
                    "max": The maximum number in the group.
                    "min": The minimum number in the group.
         */

        List<Integer> list = Arrays.asList(10, 20, 15, 25, 30);

        Map<Boolean, Map<String, Integer>> collect = list.stream().collect(Collectors.partitioningBy(num -> num % 2 == 0,
                Collectors.collectingAndThen(Collectors.toList(),
                        list1 -> {
                            int sum = list1.stream().mapToInt(Integer::intValue).sum();
                            int max = list1.stream().max(Integer::compareTo).orElse(0);
                            int min = list1.stream().min(Integer::compareTo).orElse(0);
                            Map<String, Integer> stringIntegerMap = new HashMap<>();
                            stringIntegerMap.put("sum", sum);
                            stringIntegerMap.put("max", max);
                            stringIntegerMap.put("min", min);
                            return stringIntegerMap;
                        })
        ));

        return collect;
    }

    public Map<Character, Long> question2() {
        /*
        Given a list of strings, write a Java program using the Stream API to:
            Flatten all characters from all strings into a single stream.
            Retain only alphabetic characters (ignore numbers, symbols, spaces).
            Convert characters to lowercase.
            Count the frequency of each character.
            Return a Map<Character, Long> where the key is the lowercase character, and the value is its frequency across all strings.
         */

        List<String> stringList = Arrays.asList("Hello!", "World123", "Java@Stream");

        Map<Character, Long> collect = stringList.stream()
                .flatMap(s -> s.toLowerCase().chars().mapToObj(c -> (char) c))
                .filter(Character::isAlphabetic)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return collect;

    }

    public List<Double> question3(int k) {
        /*
        Given a list of integers and a window size k, write a Java program using the Stream API to:
            Calculate the moving average of the elements in the list.
            The moving average should be computed for every consecutive k elements.
            Return a list of the moving averages, rounded to two decimal places .

         */

        List<Integer> list = Arrays.asList(1, 3, 2, 6, 12, 20);
        if (k > list.size() || k == 0) return Collections.emptyList();
        IntStream range = IntStream.range(0, list.size() - k + 1);
        List<Double> collect = range.mapToObj(x -> list.subList(x, x + k))
                .map(sub -> sub.stream().mapToInt(x -> x).average().orElse(0.0))
                .map(avg -> new BigDecimal(avg).setScale(2, RoundingMode.HALF_UP).doubleValue())
                .collect(Collectors.toList());

        return collect;
    }

    public List<Integer> question4(int n) {
        /*
        Write a Java program using the Stream API to:
            Generate the first n Fibonacci numbers.
            Return them as a List<Integer>.
         */

        if (n == 0) return Collections.emptyList();
        if (n == 1) return new ArrayList<Integer>() {{
            add(0);
        }};

        return Stream.iterate(new int[]{0, 1}, pair -> new int[]{pair[1], pair[0] + pair[1]})
                .map(pair -> pair[0])
                .limit(n)
                .collect(Collectors.toList());
    }
}

