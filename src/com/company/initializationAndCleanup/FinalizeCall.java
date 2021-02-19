package com.company.initializationAndCleanup;
/****************** Exercise 10 *****************
 * Create a class with a finalize() method that
 * prints a message. In main(), create an object
 * of your class. Explain the behavior of your
 * program.
 ************************************************/
public class FinalizeCall {
    protected void finalize() {
        System.out.println("finalize() called");
    }
    public static void main(String[] args) {
        new FinalizeCall();
    }
}
