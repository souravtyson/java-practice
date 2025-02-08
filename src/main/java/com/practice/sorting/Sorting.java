package com.practice.sorting;

import java.util.Arrays;

/**
 * @author Sourav Suman - 02-12-2024
 */
public class Sorting {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        // populate dummy value to employee object
        employees[0] = new Employee("ram", "kumar", 24);
        employees[1] = new Employee("shyam", "kumar", 23);
        employees[2] = new Employee("mohan", "kumar", 30);
        employees[3] = new Employee("sohan", "kumar", 25);
        employees[4] = new Employee("rohan", "kumar", 29);
        employees[5] = new Employee("rohini", "kumari", 27);
        employees[6] = new Employee("rohan", "singh", 28);

        // before sorting
        System.out.println("before sorting");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Arrays.sort(employees);
        System.out.println("after sorting");
        // after sorting decreasing order
        for (Employee e : employees) {
            System.out.println(e);
        }

        // sorting using comparator interface (Single abstract method)

        Department[] departments = new Department[3];
        departments[0] = new Department("IT", "Bangalore", 100);
        departments[1] = new Department("HR", "Bangalore", 200);
        departments[2] = new Department("Sales", "Bangalore", 300);
        // before sorting
        System.out.println("before sorting");

        for (Department d : departments) {
            System.out.println(d);
        }

        System.out.println("after sorting");

        Arrays.sort(departments, new SortingUsingComparator());
        for (Department d : departments) {
            System.out.println(d);
        }
    }
}
