package com.company.initializationAndCleanup;


public class OverloadedConstructor {
    OverloadedConstructor() {
        System.out.println("1st case");
    }

    OverloadedConstructor(String s) {
        System.out.println("second case " + s);
    }

    public static void main(String[] args) {
        new OverloadedConstructor();
        new OverloadedConstructor("init");
    }
}
