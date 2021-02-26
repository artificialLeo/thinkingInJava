package com.company.initializationAndCleanup;


public class ThisMethodCall {
    public void a() {
        b();
        this.b();
    }

    public void b() {
        System.out.println("b called");
    }

    public static void main(String[] args) {
        new ThisMethodCall().b();
        new ThisMethodCall().a();
    }
}
