package com.practice.second;

/*
 * to use this interface we might not need concrete class to be created.
 * All we have to do is use lambda and annonymous inner class to define the method and then call that method.
 * one of the reason could be in case we need a class implementing this interface only once.
 */

@FunctionalInterface
public interface LambdaExampleInterface {
    void draw();
}
