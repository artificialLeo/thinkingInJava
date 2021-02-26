package com.company.operators;


public class UnsignedRightShift {
    public static void main(String[] args) {
        int i = -1 << 1;

        System.out.println(Integer.toBinaryString(i));

        for (int j = 0; j <= 30; j++) {
            i >>>= 1; System.out.println(Integer.toBinaryString(i));
        }

    }
}
