package com.company.initializationAndCleanup;

public class FinalizeCall {
    protected void finalize() {
        System.out.println("finalize() called");
    }
    public static void main(String[] args) {
        new FinalizeCall();
    }
}
