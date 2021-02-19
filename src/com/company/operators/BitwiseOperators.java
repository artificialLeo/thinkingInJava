package com.company.operators;

/****************** Exercise 10 *****************
 * Write a program with two constant values, one
 * with alternating binary ones and zeroes, with
 * a zero in the least-significant digit, and the
 * second, also alternating, with a one in the
 * least-significant digit. (Hint: It's easiest to
 * use hexadecimal constants for this.) Combine
 * these two values every way possible using the
 * bitwise operators. Display the results using
 * Integer.toBinaryString().
 ************************************************/

public class BitwiseOperators {
    public static void main(String[] args) {
        int i1 = 0xaaaaaaaa;
        int i2 = 0x55555555;
        System.out.println("i1 = " + Integer.toBinaryString(i1));
        System.out.println("i2 = " + Integer.toBinaryString(i2));
        System.out.println("~i1 = " + Integer.toBinaryString(~i1));
        System.out.println("~i2 = " + Integer.toBinaryString(~i2));
        System.out.println("i1 & i1 = " + Integer.toBinaryString(i1 & i1));
        System.out.println("i1 | i1 = " + Integer.toBinaryString(i1 | i1));
        System.out.println("i1 ^ i1 = " + Integer.toBinaryString(i1 ^ i1));
        System.out.println("i1 & i2 = " + Integer.toBinaryString(i1 & i2));
        System.out.println("i1 | i2 = " + Integer.toBinaryString(i1 | i2));
        System.out.println("i1 ^ i2 = " + Integer.toBinaryString(i1 ^ i2));
    }
}
