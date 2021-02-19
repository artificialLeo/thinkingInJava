package com.company.initializationAndCleanup;
/****************** Exercise 15 ****************
 * Create a class with a String that is
 * initialized using "instance initialization."
 ***********************************************/
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
