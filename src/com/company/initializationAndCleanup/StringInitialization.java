package com.company.initializationAndCleanup;

public class StringInitialization {
    String s1 = "Init in definition";
    String s2;

    public StringInitialization(String s2i) {
        s2 = s2i;
    }

    public static void main(String[] args) {
        StringInitialization si = new StringInitialization("Init in constructor");

        System.out.println("si.s1 = " + si.s1);
        System.out.println("si.s2 = " + si.s2);
    }
}
