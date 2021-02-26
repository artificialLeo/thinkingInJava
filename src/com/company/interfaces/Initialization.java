package com.company.interfaces;


abstract class BaseWithPrint {
    public BaseWithPrint() {
        print();
    }
    public abstract void print();
}

class DerivedWithPrint extends BaseWithPrint {
    int i = 11;
    @Override
    public void print() {
        System.out.println("i = " + i);
    }
}

public class Initialization {
    public static void main(String[] args) {
        DerivedWithPrint d = new DerivedWithPrint();
        d.print();
    }
}
