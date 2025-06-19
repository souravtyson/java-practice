package com.practice.puzzle;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 08-02-2025
 */
public class Puzzle32 {
    public static void main(String[] args) {
        System.out.println(questionNumber6());
        System.out.println(questionNumber7());
        System.out.println(questionNumber8());
        System.out.println(questionNumber9());
        System.out.println(questionNumber10());
    }

    public static Map<Boolean, Map<String, Integer>> questionNumber10() {
        List<Integer> num = Arrays.asList(10, 15, 20, 25, 30);

        return num.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0,
                        Collectors.collectingAndThen(Collectors.toList(),
                                list -> {
                                    int max = list.stream().max(Integer::compareTo).orElse(0);
                                    int min = list.stream().min(Integer::compareTo).orElse(0);
                                    int sum = list.stream().mapToInt(Integer::intValue).sum();
                                    Map<String, Integer> stats = new HashMap<>();
                                    stats.put("sum", sum);
                                    stats.put("max", max);
                                    stats.put("min", min);
                                    return stats;
                                })));

    }

    public static Map<String, Map<Integer, List<String>>> questionNumber9() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30, "New York"),
                new Person("Bob", 25, "Los Angeles"),
                new Person("Charlie", 30, "New York"),
                new Person("David", 25, "New York"),
                new Person("Eve", 30, "Los Angeles")
        );

        return people.stream()
                .collect(Collectors.groupingBy(Person::getCity, Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName, Collectors.toList()))));
    }

    public static Set<String> questionNumber8() {
        List<String> arrayList = Arrays.asList("Hello world", "Hello Java world", "Java is fun");
        return arrayList.stream()
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .collect(Collectors.toSet());
    }

    public static Integer questionNumber6() {
        List<Integer> list = Arrays.asList(15, 30, 45, 10, 20, 60);
        return list.parallelStream().filter(i -> (i % 3 == 0) && (i % 5 == 0)).map(x -> x * x).reduce(0, Integer::sum);
    }

    public static Map<Integer, String> questionNumber7() {
        List<String> stringList = Arrays.asList("apple", "bat", "car", "door", "egg");
        return stringList.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.joining(",")));
    }

    static class Person {
        String name;
        int age;
        String city;

        public Person(String name, int age, String city) {
            this.name = name;
            this.age = age;
            this.city = city;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getCity() {
            return city;
        }
    }

}
