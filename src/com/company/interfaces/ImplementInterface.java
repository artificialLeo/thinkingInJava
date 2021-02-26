package com.company.interfaces;

interface AnInterface {
    public void f();
    public void g();
    public void h();
}

class ImplementInterfaceExample implements AnInterface {

    @Override
    public void f() {
        System.out.println("ImplementInterface.f");
    }

    @Override
    public void g() {
        System.out.println("ImplementInterface.g");
    }

    @Override
    public void h() {
        System.out.println("ImplementInterface.h");
    }
}

public class ImplementInterface {
    public static void main(String[] args) {
        ImplementInterfaceExample ii = new ImplementInterfaceExample();
        ii.f();
        ii.g();
        ii.h();
    }

}
