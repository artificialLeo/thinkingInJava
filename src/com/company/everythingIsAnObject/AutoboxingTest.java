package com.company.everythingIsAnObject;

/****************** Exercise 9 ******************
 * Write a program to demonstrate that
 * autoboxing works for all the primitive types
 * and their wrappers.
 ************************************************/

public class AutoboxingTest {
    public static void main(String[] args) {
        Byte by = 1;
        byte bt = by;
        System.out.println("byte = " + bt);
        Short sy = 1;
        short st = sy;
        System.out.println("short = " + st);
        Integer iy = 1;
        int it = iy;
        System.out.println("int = " + it);
        Double dy = 1.0d;
        double dt = dy;
        System.out.println("double = " + dt);
        Float fy = 1.0f;
        float ft = fy;
        System.out.println("float = " + ft);
        Long ly = 1l;
        long lt = ly;
        System.out.println("long = " + lt);
        Character cy = 'c';
        char ct = cy;
        System.out.println("char = " + ct);
        Boolean bly = false;
        boolean blt = bly;
        System.out.println("boolean = " + blt);

    }
}
