package com.company.initializationAndCleanup;
/****************** Exercise 11 ****************
 * Modify Exercise 10 so your
 * finalize() will always be called.
 ***********************************************/

public class FinalizeAlwaysCalled {
    protected void finalize() {
        System.out.println("finalize() called");
    }
    public static void main(String[] args) {
        new FinalizeAlwaysCalled();
        System.gc();
        System.runFinalization();
    }
}
