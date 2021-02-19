package com.company.initializationAndCleanup;
/****************** Exercise 3 ******************
 * Create a class with a default constructor (one
 * that takes no arguments) that prints a
 * message. Create an object of this class.
 ************************************************/
public class DefaultConstructor {
    DefaultConstructor() {
        System.out.println("Default Constructor");
    }

    public static void main(String[] args) {
        new DefaultConstructor();
    }
}
