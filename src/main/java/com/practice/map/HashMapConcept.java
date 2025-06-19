package com.practice.map;

import java.util.*;

public class HashMapConcept {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<Employee>();
        Employee employee = new Employee(1, "Sourav");
        Employee employee1 = new Employee(2, "Samiksha");
        Employee employee2 = new Employee(3, "Rohit");
        Employee employee3 = new Employee(4, "Rahul");
        Employee employee4 = new Employee(5, "Ravi");
        Employee employee5 = new Employee(6, "Ravi");

        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);

        Map<Employee, String> collect = new HashMap<>();
        collect.put(employee, "Value1");
        collect.put(employee1, "Value2");
        collect.put(employee2, "Value3");
        collect.put(employee3, "Value4");
        collect.put(employee4, "Value5");
        collect.put(employee5, "Value5");

//        Map<Employee, String> collect = employeeList.stream().collect(Collectors.toMap(Function.identity(), e -> e.getName()));

        System.out.println(collect.size());
        System.out.println(collect);
    }
}


class Employee {
    private int id;
    private String name;

    public Employee() {
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("id: " + id + " name : " + name + " = " + Objects.hash(name));
        return Objects.hash(name);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}