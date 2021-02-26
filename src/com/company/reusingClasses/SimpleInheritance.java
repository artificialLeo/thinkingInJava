package com.company.reusingClasses;

class A {
    public A() {
        System.out.println("A()");
    }
}

class B {
    public B() {
        System.out.println("B()");
    }
}

class C extends A {
    B b = new B();
}

public class SimpleInheritance {
    public static void main(String[] args) {
        new C();
    }
}
