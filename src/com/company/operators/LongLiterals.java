package com.company.operators;

/****************** Exercise 8 *****************
 * Show that hex and octal notations work with long
 * values. Use Long.toBinaryString() to display
 * the results.
 ***********************************************/

public class LongLiterals {
    public static void main(String[] args) {
        long l1 = 0x2f;
        System.out.println("l1: " + Long.toBinaryString(l1));
        long l2 = 0x2F;
        System.out.println("l2: " + Long.toBinaryString(l2));
        long l3 = 0177;
        System.out.println("l3: " + Long.toBinaryString(l3));
    }
}
