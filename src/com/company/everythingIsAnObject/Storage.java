package com.company.everythingIsAnObject;


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
