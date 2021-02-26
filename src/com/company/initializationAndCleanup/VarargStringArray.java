package com.company.initializationAndCleanup;

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
