package com.company.operators;



public class SignedRightShift {
    public static void main(String[] args) {
        int k = 0x80000000;
        System.out.println(Integer.toBinaryString(k));
        for (int i = 0; i <= 30; i++) {
            k >>= 1; System.out.println(Integer.toBinaryString(k));
        }
    }
}
