package com.practice.puzzle;

import java.util.*;
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

        System.out.println(getEvenNumbers());
        System.out.println(getOddNumbers());
        System.out.println(getQuestion2());
        System.out.println(getQuestion3());
        System.out.println(getQuestion4());
        System.out.println(getQuestion5());
    }

    public static List<Integer> getEvenNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        return numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> getOddNumbers() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        return numbers.stream().filter(n -> n % 2 != 0 ).collect(Collectors.toList());
    }

    public static List<String> getQuestion2() {
        List<String> stringList = Arrays.asList("apple", "bat", "car", "door", "egg");
        return stringList.stream()
                .filter(word -> word.length() >= 4)
                .map(String::toUpperCase)
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }

    public static Map<Integer, List<String>> getQuestion3() {
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 30),
                new Person("David", 25)
        );

        return people.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Person::getName,
                Collectors.toList())));
    }

    public static Map<String, Integer> getQuestion4() {
        List<Integer> numbers = Arrays.asList(3, 5, 9, 10, 12, 15);

        Map<String, Integer> map = new HashMap<>();

        map.put("sumDivBy3", numbers.stream().filter(n -> n % 3 == 0).reduce(0, (a,b) -> a + b));
        map.put("productDivBy5", numbers.stream().filter(n -> n % 5 == 0).reduce(1, (a,b) -> a * b));

        return map;
    }

    public static Map<Character, Long> getQuestion5() {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        List<String> wordsList = Arrays.asList("apple", "orange", "banana");

        return wordsList.stream()
                .flatMap(word -> word.toLowerCase()
                        .chars()
                        .mapToObj(c -> (char)c)
                ).filter(k -> vowels.contains(k))
                .collect(Collectors.groupingBy(Character::charValue, Collectors.counting()));

    }


    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
