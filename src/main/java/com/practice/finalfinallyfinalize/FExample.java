package com.practice.finalfinallyfinalize;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FExample {

    /*
    final - it is a keyword which is used to make the varibale in class unmodifiable and should ne initialized at the time of variable declaration. The variable
     which is declared final will not be reassigned if done there will be compilation issues.
    finally - finally is a keyword which is used when you want to make the connection close if any connection has been made. so finally is used when we are using try catch
    block or only try block. Basically whichever bock gets executed either try or exception finally block is suppose to execute.
    That is why we use finally block to close any open connection like db connection or reading a file.
    finalize - finalize is a method that is used by GC to clean up any object for Garbage collection. you can call finalize one time per object. Executed just
    before the object is garbage collected
     */

    private static final String TEST = "";
    BufferedInputStream bfis = new BufferedInputStream(new InputStream() {
        @Override
        public int read() throws IOException {
            return 0;
        }
    });

    public static void main(String[] args) {
        try {
            System.out.println("inside try block");
            System.gc();
        } catch (Exception ex) {
            System.out.println("inside excpetion block");
        } finally {
            System.out.println("inside finally block");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("inside finalize try block");
            super.finalize();
        } catch (Exception ex) {
            System.out.println("inside finalize catch block");
        }
    }

}
