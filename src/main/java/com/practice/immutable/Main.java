package com.practice.immutable;

import java.util.Arrays;
import java.util.Date;
import java.util.stream.Collectors;

/**
 * @author Sourav Suman - 08-12-2024
 */
public class Main {

    public static void main(String[] args) {
        Employee2 e = new Employee2(1, "sourav", new Date(), Arrays.stream(new String[] {"876","143"}).collect(Collectors.toList()));
        System.out.println(e);
        e.getDate().setTime(12); // immutable after cloning
        e.getZip().add("453");
        System.out.println(e);
    }
}
