package com.company.initializationAndCleanup;
/****************** Exercise 8 *****************
 * Create a class with two methods. Within the
 * first method call the second method twice to
 * see it work, the first time without using this,
 * and the second time using this.
 * (You should not use this form in practice.)
 ***********************************************/

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
