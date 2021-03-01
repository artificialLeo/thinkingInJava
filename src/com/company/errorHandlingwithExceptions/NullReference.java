package com.company.errorHandlingwithExceptions;

public class NullReference {
    public static void main(String[] args) {
        String s = null;

        try {
            s.toString();
        } catch (Exception e) {
            System.out.println("Caught exception " + e);
        }
    }
}
