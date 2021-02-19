package com.company.operators;

/****************** Exercise 11 *****************
 * Start with a number that has a binary one in
 * the most significant position. (Hint: Use a
 * hexadecimal constant.) Use the signed
 * right-shift operator to right shift your
 * number through all its binary positions.
 * Display each result using Integer.toBinaryString().
 ************************************************/

public class SignedRightShift {
    public static void main(String[] args) {
        int k = 0x80000000;
        System.out.println(Integer.toBinaryString(k));
        for (int i = 0; i <= 30; i++) {
            k >>= 1; System.out.println(Integer.toBinaryString(k));
        }
    }
}