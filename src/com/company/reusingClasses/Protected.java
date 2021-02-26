package com.company.reusingClasses;

public class Protected {
    protected void f() {}
}

class Derived extends Protected {
    public void g() { f(); }
}

class ProtectedTest {
    public static void main(String[] args) {
        new Protected().f();// shouldn't
        new Derived().g();
    }
}