package com.company.everythingIsAnObject;

/****************** Exercise 6 ******************
 Thinking in Java, 4th 12 Edition Annotated Solution Guide
 * Write a program that includes and calls the
 * storage() method defined as a code fragment in
 * this chapter.
 ************************************************/

public class Storage {
    String greeting = "Hello, World!";

    int storage(String multipliedLength) {
        return  multipliedLength.length() * 2;
    }

    void print() {
        System.out.println("storage(greeting) = " + storage(greeting));
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.print();
    }
}
