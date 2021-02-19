package com.company.everythingIsAnObject;

/****************** Exercise 8 ******************
 * Write a program to demonstrate that no
 * matter how many objects you create of a
 * particular class, there is only one instance
 * of a particular static field in that class.
 ************************************************/

public class StaticTestInstance {
    static int i = 1;

    public static void main(String[] args) {
        StaticTestInstance staticTestInstance1 = new StaticTestInstance();
        StaticTestInstance staticTestInstance2 = new StaticTestInstance();

        System.out.println(staticTestInstance1.i + " == " + staticTestInstance2.i);
        staticTestInstance1.i++;
        System.out.println(staticTestInstance1.i + " == " + staticTestInstance2.i);
    }
}
