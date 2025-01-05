package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 05-01-2025
 */
/*
Write a program to group a list of people (with name and age properties) by their age using the Stream API.
 */
public class Puzzle17 {
    public static void main(String[] args) {
        Puzzle17 puzzle17 = new Puzzle17();
        System.out.println(puzzle17.groupPeopleByAge(new Person[]{new Person("Sourav", 30), new Person("Rahul", 30), new Person("Raj", 25), new Person("Rajesh", 25)}));
        System.out.println(puzzle17.groupPeopleByAge(new Person[] {new Person("Alice", 30), new Person("Bob", 25), new Person("Charlie", 30), new Person("Diana", 25), new Person("Eve", 35)}));
    }

    private Map<Integer, List<Person>> groupPeopleByAge(Person[] people) {
        return Arrays.stream(people).collect(Collectors.groupingBy(x -> x.getAge()));
    }
}

class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
