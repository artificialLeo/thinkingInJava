package com.company.initializationAndCleanup;
/****************** Exercise 17 *****************
 * Create a class with a constructor that takes
 * a String argument. During construction, print
 * the argument. Create an array of object
 * references to this class, but don't
 * create objects to assign into the
 * array. When you run the program, notice
 * whether the initialization messages from the
 * constructor calls are printed.
 ************************************************/
class Test {
    Test(String s) {
        System.out.println("String constructor; s = " + s);
    }
}

public class ObjectReferences {
    Test[] array1 = new Test[5];

    public static void main(String[] args) {
        Test[] array2 = new Test[5];
    }
}
