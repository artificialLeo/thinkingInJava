package com.company.operators;

/****************** Exercise 14 *****************
 * Write a method that compares two String arguments
 * using all the Boolean comparisons and print the
 * results. Perform the equals() test for the == and
 * !=. In main(), call your method with different
 * String objects.
 ************************************************/

public class CompareStrings {
    public static void p(String s, boolean b) {
        System.out.println(s + ": " + b);
    }

    public static void compare(String lval, String rval) {
        System.out.println("lval: " + lval);
        System.out.println("rval: " + rval);

        p("lval == rval", lval == rval);
        p("lval != rval", lval != rval);
        p("lval.equals(rval)", lval.equals(rval));
    }

    public static void main(String[] args) {
        compare("Hello", "Hello");
        String s = new String("Hello");
        compare("Hello", s);
        compare("Hello", "Goodbye");
    }
}