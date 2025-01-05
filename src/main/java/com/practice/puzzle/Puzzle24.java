package com.practice.puzzle;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 06-01-2025
 */
/*
Given a list of employees (with id, name, and salary), write a Stream API pipeline to:

Filter employees with a salary greater than 50,000.
Sort the filtered employees by salary in descending order.
Collect their names into a list.
 */
public class Puzzle24 {
    public static void main(String[] args) {
        Puzzle24 puzzle24 = new Puzzle24();
        List<Employee> employees = Arrays.asList(
                new Employee(1, "John", 50000),
                new Employee(2, "Jane", 60000),
                new Employee(3, "Bob", 45000),
                new Employee(4, "Alice", 55000),
                new Employee(5, "Tom", 40000)
        );
        System.out.println(puzzle24.getEmployeeNames(employees));
    }

    private List<String> getEmployeeNames(List<Employee> employees) {
        return employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary()))
                .map(Employee::getName)
                .collect(Collectors.toList());
    }
}

class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
