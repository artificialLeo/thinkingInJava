package com.company.everythingIsAnObject;

/****************** Exercise 1 *****************
 * Create a class containing an int and a char
 * that are not initialized. Print their values
 * to verify that Java performs default
 * initialization.
 ***********************************************/

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
