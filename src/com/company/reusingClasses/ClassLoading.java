package com.company.reusingClasses;

class LoadTest {
    static {
        System.out.println("Loading LoadTest 1");
    }

    static void staticMember() {}
}

public class ClassLoading {
    public static void main(String[] args) {
        System.out.println("Creating an object");
        new LoadTest();
        System.out.println("Calling static member");
        LoadTest.staticMember();
    }
}
