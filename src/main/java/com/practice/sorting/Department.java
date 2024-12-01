package com.practice.sorting;

/**
 * @author Sourav Suman - 02-12-2024
 */
public class Department {
    private String name;
    private String location;
    private int noOfEmployee;
    public Department(String name, String location, int noOfEmployee) {
        this.name = name;
        this.location = location;
        this.noOfEmployee = noOfEmployee;
    }

    public Department() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNoOfEmployee() {
        return noOfEmployee;
    }

    public void setNoOfEmployee(int noOfEmployee) {
        this.noOfEmployee = noOfEmployee;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", noOfEmployee=" + noOfEmployee +
                '}';
    }
}
