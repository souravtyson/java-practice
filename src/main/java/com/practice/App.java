package com.practice;

import com.practice.first.*;
import com.practice.second.LambdaExampleInterface;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        InterfaceA inter = new ImplementA();
        inter.show();

        // lambda + anonymous class
        LambdaExampleInterface interfx = new LambdaExampleInterface() {
            public void draw() {
                System.out.println("using lambda expression x");
            }
        };
        //here using anonymous class + lambda
        LambdaExampleInterface interf = () -> System.out.println("using lambda expression");
        interf.draw();
        interfx.draw();
    }
}
