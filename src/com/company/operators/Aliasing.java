package com.company.operators;

class Integral {
    float f;
}

public class Aliasing {
    public static void main(String[] args) {
        Integral n1 = new Integral();
        Integral n2 = new Integral();

        n1.f = 1f;
        n2.f = 2f;

        System.out.println("1: n1.f: " + n1.f + ", n2.f: " + n2.f);
        n1 = n2;
        System.out.println("1: n1.f: " + n1.f + ", n2.f: " + n2.f);
        n1.f = 3f;
        System.out.println("1: n1.f: " + n1.f + ", n2.f: " + n2.f);
    }
}
