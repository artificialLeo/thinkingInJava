package com.company.operators;




public class AliasingFloat {
    static void f(Integral y) {
        y.f = 1.0f;
    }

    public static void main(String[] args) {
        Integral integral = new Integral();

        integral.f = 2.0f;
        System.out.println("before f function: " + integral.f);
        f(integral);
        System.out.println("after f function: " + integral.f);
    }
}
