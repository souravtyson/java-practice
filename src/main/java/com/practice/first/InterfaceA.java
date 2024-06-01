package com.practice.first;

/*
 * functional interface will have one method only. you can have Object class
 * method also declared out in this functional interface. but other than that
 *  only one method should be decalred.
 */

@FunctionalInterface
public interface InterfaceA {
    void show();
    String toString();
}