package com.company.initializationAndCleanup;
/****************** Exercise 19 *****************
 * Write a method that takes a vararg String
 * array. Verify that you can pass either a
 * comma-separated list of Strings or a
 * String[] into this method.
 ************************************************/
public class VarargStringArray {
    static void printStrings(String... strs) {
        for(String s : strs)
            System.out.println(s);
    }
    public static void main(String[] args) {
        printStrings("These", "are", "some", "strings");
        printStrings(
                new String[] { "These", "are", "some", "strings" }
        );
    }

}
