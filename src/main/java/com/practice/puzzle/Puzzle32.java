package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Puzzle32 {
    public static void main(String[] args) {
        System.out.println(questionNumber6());
    }

    public static Integer questionNumber6() {
        List<Integer> list = Arrays.asList(15, 30, 45, 10, 20, 60);
        return list.parallelStream().filter(i -> (i % 3 == 0) && (i % 5 == 0)).map(x -> x * x).reduce(0, Integer::sum);
    }

    public static Map<Integer, String> questionNumber7() {
        List<String> stringList = Arrays.asList("apple", "bat", "car", "door", "egg");
        return stringList.stream().collect(Collectors.groupingBy(x -> x, Function.identity()));
    }
}
