package com.company.operators;

/****************** Exercise 12 *****************
 * Start with a number that is all binary ones.
 * Left shift it, then use the unsigned right-shift
 * operator to right shift through all of its binary
 * positions. Display each result using
 * Integer.toBinaryString().
 ************************************************/

public class UnsignedRightShift {
    public static void main(String[] args) {
        int i = -1 << 1;

        System.out.println(Integer.toBinaryString(i));

        for (int j = 0; j <= 30; j++) {
            i >>>= 1; System.out.println(Integer.toBinaryString(i));
        }

    }
}
