package com.practice.sorting;

/**
 * @author Sourav Suman - 02-12-2024
 */
public class Employee implements Comparable<Employee>{

    private String firstName;
    private String lastName;
    private int age;

    public Employee() {
    }

    public Employee(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Employee e) {
        if(this.getAge() <= e.getAge()) {
            return 1;
        } else if(this.getAge() >= e.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
