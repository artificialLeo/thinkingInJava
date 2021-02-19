package com.company.initializationAndCleanup;
/****************** Exercise 4 *****************
 * Add an overloaded constructor to Exercise 3 that
 * takes a String argument and prints it along with
 * your message.
 ***********************************************/

public class OverloadedConstructor {
    OverloadedConstructor() {
        System.out.println("1st case");
    }

    OverloadedConstructor(String s) {
        System.out.println("second case " + s);
    }

    public static void main(String[] args) {
        new OverloadedConstructor();
        new OverloadedConstructor("init");
    }
}
