package com.company.everythingIsAnObject;


class StaticTest {
    static int i = 1;
}

public class Incrementable {
    static void increment() { StaticTestInstance.i++; }

    public static void main(String[] args) {
        Incrementable incrementable = new Incrementable();
        incrementable.increment();
        Incrementable.increment();
        increment();
    }
}
