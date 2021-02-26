package com.company.reusingClasses;


class Base1 {
    public Base1() {
        System.out.println("One");
    }
}

class Derived1 extends Base1 {
    public Derived1() {
        System.out.println("Two");
    }
}

class Derived2 extends Derived1 {
    public Derived2() {
        System.out.println("Three");
    }
}

public class ConstructorOrder {
    public static void main(String[] args) {
        new Derived2();
    }
}

