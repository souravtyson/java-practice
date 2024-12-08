package com.practice.immutable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Sourav Suman - 08-12-2024
 */
public final class Employee2 {
    private final int id;
    private final String name;
    private final Date date;
    private final List<String> zip;

    public Employee2(int id, String name, Date date, List<String> zip) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.zip = zip;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return (Date) date.clone();
    }

    public List<String> getZip() {
        return new ArrayList<>(zip);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", zip=" + zip +
                '}';
    }
}
