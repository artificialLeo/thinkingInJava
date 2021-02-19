package com.company.initializationAndCleanup;
/****************** Exercise 9 *****************
 * Create a class with two (overloaded)
 * constructors. Using this, call the second
 * constructor inside the first one.
 ***********************************************/
public class ThisConstructorCall {
    public ThisConstructorCall(String s) {
        System.out.println("s = " + s);
    }

    public ThisConstructorCall(int i) {
        this("i = " + i);
    }

    public static void main(String[] args) {
        new ThisConstructorCall("String call");
        new ThisConstructorCall(47);
    }
}
