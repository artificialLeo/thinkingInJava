package com.company.everythingIsAnObject;



public class DefaultInitialization {
    int a;
    char b;

    public DefaultInitialization() {
        System.out.println("int a = " + a);
        System.out.println("char b = [" + b + "]");
    }

    public static void main(String[] args) {

        new DefaultInitialization();
    }
}
