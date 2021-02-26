package com.company.innerClasses;

public class InnerClassAccess {
    private int i = 10;
    private void f() {
        System.out.println("InnerClassAccess.f");
    }

    class Inner {
        void g() {
            i++;
            f();
        }
    }

    public void h() {
        Inner in = new Inner();
        in.g();
        System.out.println("i = " + i);
    }

    public static void main(String[] args) {
        InnerClassAccess ica = new InnerClassAccess();
        ica.h();
    }
}