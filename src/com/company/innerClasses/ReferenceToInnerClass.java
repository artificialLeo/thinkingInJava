package com.company.innerClasses;

class Outer {
    class Inner {
        {
            System.out.println("Inner created!");
        }
    }
    Inner getInner() { return new Inner(); }
}

public class ReferenceToInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        Outer.Inner i = o.getInner();
    }
}
