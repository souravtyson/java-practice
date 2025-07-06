package com.practice.puzzle;

import java.util.*;
import java.util.stream.Collectors;

public class Puzzle35 {

    public static void main(String[] args) {

        Employee emp1 = new Employee(1, "sourav", "suman", "sourav@gmail.com", "M", true, 20000, 5);
        Employee emp2 = new Employee(2, "samkisha", "jain", "samiksha@gmail.com", "F", true, 25000, 2);
        Employee emp3 = new Employee(3, "Rubie", "Fulep", "rfulep3@soundcloud.com", "F", false, 30000, 2);
        Employee emp4 = new Employee(4, "sourav", "ganguly", "ganguly@gmail.com", "M", false, 10000, 3);
        Employee emp5 = new Employee(5, "rahul", "dravid", "rahul@gmail.com", "M", false, 15000, 1);
        List<Employee> empList = new ArrayList<>();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        // filter employee list with gender as Female.
        List<Employee> x1 = empList.stream().filter(x -> x.gender.equals("F")).collect(Collectors.toList());
        iterateList(x1);

        // filter employee list witj newJoiner as True;
        List<Employee> x2 = empList.stream().filter(x -> x.newJoiner).collect(Collectors.toList());
        iterateList(x2);

        // sort based on rating in desc.
        List<Employee> x3 = empList.stream().sorted(Comparator.comparing(x -> ((Employee) x).rating).reversed()).collect(Collectors.toList());
        iterateList(x3);

        // sort based on rating in asc.
        List<Employee> x4 = empList.stream().sorted(Comparator.comparing(x -> x.rating)).collect(Collectors.toList());
        iterateList(x4);

        // sort based on rating and salary
        List<Employee> x5 = empList.stream().sorted(Comparator.comparing(Employee::getRating)
                .thenComparing(Employee::getSalary)).collect(Collectors.toList());
        iterateList(x5);

        // employee with salary greater than 15000
        boolean b = empList.stream().anyMatch(emp -> emp.getSalary() > 15000);
        System.out.println(b);

        // group by gender
        Map<String, List<Employee>> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender));
        System.out.println(collect);

        // max based on salary

        Optional<Employee> empOpt = empList.stream().max(Comparator.comparing(Employee::getSalary));
        Employee e = empOpt.get();
        System.out.println(e.firstName);

    }

    public static void iterateList(List<Employee> e1) {
        e1.forEach(x -> System.out.println(x.empId + " " + x.firstName));
        System.out.println("*******************");
    }

    static class Employee {
        int empId;
        String firstName;
        String lastName;
        String email;
        String gender;
        boolean newJoiner;
        double salary;
        int rating;

        public Employee(int empId, String firstName, String lastName, String email, String gender, boolean newJoiner, double salary, int rating) {
            this.empId = empId;
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.gender = gender;
            this.newJoiner = newJoiner;
            this.salary = salary;
            this.rating = rating;
        }

        public int getRating() {
            return rating;
        }

        public double getSalary() {
            return salary;
        }

        public String getGender() {
            return gender;
        }
    }

}
