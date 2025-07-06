package com.practice.puzzle;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Puzzle37 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");

        // get all elements
        OptionalInt max = words.stream().mapToInt(String::length).max();
        int val = max.getAsInt();
        List<String> maxWords = words.stream().filter(x -> x.length() == val).collect(Collectors.toList());
        System.out.println(maxWords);

        // get first element
        Optional<String> max1 = words.stream().max(Comparator.comparing(String::length));
        String s = max1.get();
        System.out.println(s);

        List<Integer> numbers = Arrays.asList(1, 2, 2, 4, 3, 2, 4, 5, 6, 4, 7);
        List<Integer> collect = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        List<Transaction> transactions = Arrays.asList(
                new Transaction(LocalDate.of(2023, 10, 1), 100),
                new Transaction(LocalDate.of(2023, 10, 1), 200),
                new Transaction(LocalDate.of(2023, 10, 2), 150),
                new Transaction(LocalDate.of(2023, 10, 2), 250),
                new Transaction(LocalDate.of(2023, 10, 3), 250),
                new Transaction(LocalDate.of(2023, 10, 4), 250),
                new Transaction(LocalDate.of(2023, 10, 4), 250)
        );

        Map<LocalDate, Double> collect1 = transactions.stream().collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(collect1);

        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> collect2 = numbers1.stream().collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect2);

        List<String> strings = Arrays.asList("flower", "flow", "flight");

        String initialPrefix = strings.get(0);

        String reduce = strings.stream().reduce(initialPrefix, (prefix, elem) -> {
            int minLength = Math.min(prefix.length(), elem.length());
            int i = 0;
            while (i < minLength && prefix.charAt(i) == elem.charAt(i)) {
                i++;
            }
            return prefix.substring(0, i);
        });

        System.out.println(reduce);

        List<Integer> numbers2 = Arrays.asList(4, 6, 8, 9, 11, 10);
        Integer first = numbers2.stream().filter(Puzzle37::isPrime).findFirst().orElse(1);
        System.out.println(first != 1);


    }

    private static boolean isPrime(Integer x) {
        if (x == 2 || x == 3) {
            return true;
        }

        for (int k = 2; k < x; k++) {
            if (x % k == 0) {
                return false;
            }
        }
        return true;
    }

    static class Transaction {
        private LocalDate date;
        private double amount;

        // Constructor
        public Transaction(LocalDate date, double amount) {
            this.date = date;
            this.amount = amount;
        }

        // Getters
        public LocalDate getDate() {
            return date;
        }

        public double getAmount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Transaction{" +
                    "date=" + date +
                    ", amount=" + amount +
                    '}';
        }
    }
}
