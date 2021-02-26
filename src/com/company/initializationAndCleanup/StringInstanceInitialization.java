package com.company.initializationAndCleanup;

public class StringInstanceInitialization {
    String s;
    { s = "'instance initialization'"; }
    public StringInstanceInitialization() {
        System.out.println("Default constructor; s = " + s);
    }
    public StringInstanceInitialization(int i) {
        System.out.println("int constructor; s = " + s);
    }
    public static void main(String[] args) {
        new StringInstanceInitialization();
        new StringInstanceInitialization(1);
    }
}
