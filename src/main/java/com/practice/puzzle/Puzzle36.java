package com.practice.puzzle;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Puzzle36 {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // Find the longest string in a list of strings using Java streams.
        // ["apple", "banana", "cherry", "date", "grapefruit"]

        List<String> lists = Arrays.asList("apple", "banana", "cherry", "date", "grapefruit");

        Optional<String> y = lists.stream().max(Comparator.comparing(String::length));
        if (y.isPresent()) {
            System.out.println(y.get());
        }

        System.out.println("*******************");

        // Calculate the average age of a list of Person objects using Java streams.
        // [{"Name": "Alice", "age": 25}, {"Name": "Bob", "age": 30}, {"Name": "Charlie", "age": 35}]

        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 35)
        );

        Double avg = people.stream().mapToDouble(Person::getAge).average().orElse(0);
        System.out.println(avg);

        System.out.println("*******************");

        // Check if a list of integers contains a prime number using Java streams.
        // [2, 4, 6, 8, 10, 11, 12, 13, 14, 15]

        List<Integer> number = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 13, 14, 15);
        System.out.println(number);

        List<Integer> prime = number.stream().filter(x -> isPrime(x)).collect(Collectors.toList());
        System.out.println(prime);

        System.out.println("*******************");

        // Merge two sorted lists into a single sorted list using Java streams.
        // [1, 3, 5, 7, 9]
        // [2, 4, 6, 8, 10]


        List<Integer> number1 = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> number2 = Arrays.asList(2, 4, 6, 8, 10);

        List<Integer> num = new ArrayList<>();
        num.addAll(number1);
        num.addAll(number2);

        List<Integer> num2 = num.stream().sorted(Comparator.comparing(Integer::valueOf)).collect(Collectors.toList());
        System.out.println(num2);

        System.out.println("*******************");

        // Find the intersection of two lists using Java streams.
        // [1, 2, 3, 4, 5]
        // [3, 4, 5, 6, 7]

        List<Integer> number3 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> number4 = Arrays.asList(3, 4, 5, 6, 7);

        List<Integer> num5 = number3.stream().filter(n -> number4.contains(n)).collect(Collectors.toList());
        System.out.println(num5);
        System.out.println("*******************");

        // Remove duplicates from a list while preserving the order using Java streams.
        // [1, 2, 3, 2, 1, 5, 6, 5]

        List<Integer> numList = Arrays.asList(1, 2, 3, 2, 1, 5, 6, 5);
        List<Integer> collect = numList.stream().distinct().collect(Collectors.toList());

        System.out.println(collect);

        System.out.println("*******************");

        // "Given a list of transactions, find the sum of transaction amounts for each day using Java streams."

        List<Transaction> transactions = Arrays.asList(
                new Transaction(LocalDate.of(2023, 10, 1), 100.0),
                new Transaction(LocalDate.of(2023, 10, 1), 200.0),
                new Transaction(LocalDate.of(2023, 10, 2), 150.0),
                new Transaction(LocalDate.of(2023, 10, 2), 300.0),
                new Transaction(LocalDate.of(2023, 10, 3), 50.0),
                new Transaction(LocalDate.of(2023, 10, 3), 250.0)
        );

        Map<LocalDate, Double> dateAmountGrouping = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getDate, Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(dateAmountGrouping);

        System.out.println("*******************");

        // Implement a method to partition a list into two groups based on a predicate using Java streams.
        // [1, 2, 3, 4, 5, 6, 7, 8, 9]

        List<Integer> partList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Map<Boolean, List<Integer>> u = partList.stream().collect(Collectors.partitioningBy(x -> x > 5));

        System.out.println(u);


        System.out.println("*******************");

        //  Find the maximum product of two integers in an array using Java streams.
        //  [1, 4, 3, 6, 2, 7, 8]

        List<Integer> integer = Arrays.asList(1, 4, 3, 6, 2, 7, 8);

        List<Integer> sorted = integer.stream().sorted(Comparator.comparingInt(Integer::valueOf)).collect(Collectors.toList());
        System.out.println(sorted);

        int max1 = sorted.get(sorted.size() - 1);
        int max2 = sorted.get(sorted.size() - 2);

        int min1 = sorted.get(0);
        int min2 = sorted.get(1);

        int product = max1 * max2 > min1 * min2 ? max1 * max2 : min1 * min2;
        System.out.println(product);

        System.out.println("*************************");

        // Implement a method to find all anagrams in a list of strings using Java streams.
        // ["listen", "silent", "hello", "world", "night", "thing"]

        List<String> words = Arrays.asList("listen", "silent", "hello", "world", "night", "thing");

        Map<String, List<String>> k = words.stream()
                .collect(Collectors.groupingBy(word -> sortWord(word)));

        k.values().stream().filter(x -> x.size() > 1)
                .flatMap(List::stream).forEach(System.out::println);

        System.out.println("*************************");

        // Find the number of occurrences of a given character in a list of strings using Java streams.
        // ["apple", "banana", "orange", "grape", "melon"]

        List<String> uList = Arrays.asList("apple", "banana", "orange", "grape", "melon");

        Map<Character, Long> t = uList.stream().flatMapToInt(String::chars)
                .mapToObj(c -> (char) c).collect(Collectors.groupingBy(l -> l, Collectors.counting()));

        System.out.println(t);

        System.out.println("*************************");

        // Given a list of integers, find all non-duplicate integers using Java streams.
        // [1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9]

        List<Integer> question4 = Arrays.asList(1, 2, 3, 2, 4, 5, 6, 4, 7, 8, 9);
        List<Integer> uniq4 = question4.stream().distinct().collect(Collectors.toList());
        System.out.println(uniq4);

        System.out.println("*************************");

        // Given a list of strings, find the longest string using Java streams
        // ["apple", "banana", "orange", "grape", "kiwi"]


        List<String> quest5 = Arrays.asList("apple", "banana", "orange", "grape", "kiwi");
        Optional<String> s = quest5.stream().max(Comparator.comparing(String::length));
        if (s.isPresent()) {
            System.out.println(s.get());
        }

        System.out.println("*************************");

        // From the input, filter names starting with 'A', map them to uppercase, collect to a new list, and count the names with length greater than 4.
        // ["Alice", "Bob", "Charlie", "David", "Eve"]

        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Eve", "Andrew");
        int total = names.stream().filter(n -> n.charAt(0) == 'A')
                .map(upper -> upper.toUpperCase())
                .filter(greater -> greater.length() > 4)
                .collect(Collectors.toList())
                .size();

        System.out.println(total);
    }

    public static String sortWord(String word) {
        return word.chars().sorted().mapToObj(c -> (char) c).map(String::valueOf).collect(Collectors.joining());
    }

    public static boolean isPrime(Integer num) {
        if (num < 4) {
            return true;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
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

    static class Person {
        private String name;
        private int age;

        // Constructor
        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }
}
