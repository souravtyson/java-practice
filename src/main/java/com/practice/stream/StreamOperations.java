package com.practice.stream;

import java.util.Arrays;
import java.util.List;

public class StreamOperations {
    public static void main(String[] args) {
        peek_working();
    }

    public static void peek_working() {
        List<Integer> lists = Arrays.asList(10, 2, 4);
        lists.stream().peek(System.out::println).map(n -> n * 2).forEach(System.out::println);
    }
}
