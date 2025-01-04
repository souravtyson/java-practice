package com.practice.multipleinheritance;

public interface TestI {

    // as you can see TestI has one abstract method and that was create at the starting of the project so accordingly every class implementing
    // TestI has this method getting overrided. But later after change in requirement team came up with a decision that Test2 class need one other implementation.
    // so adding default method in TestI interface class will give the non-breakable code. where other class need not to implement that method.

    public void m1();

    public default void m2() {
        System.out.println("inside m2 method of interface TestI class");
    }

    public default void m3() {
        System.out.println("inside m3 method of interface TestI class");
    }

    public default void m4() {
        System.out.println("inside m4 method of interface TestI class");
    }
}
