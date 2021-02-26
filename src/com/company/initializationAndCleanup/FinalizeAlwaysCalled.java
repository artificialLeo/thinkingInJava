package com.company.initializationAndCleanup;


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
