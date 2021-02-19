package com.company.initializationAndCleanup;
/****************** Exercise 01 ****************
 * Create a class with an uninitialized
 * String reference. Demonstrate that this
 * reference is initialized by Java to null.
 ***********************************************/
public class StringRefInitialization {
    String s;

    public static void main(String[] args) {
        StringRefInitialization sri =
                new StringRefInitialization();

        System.out.println("sri.s= " + sri.s);
    }
}
