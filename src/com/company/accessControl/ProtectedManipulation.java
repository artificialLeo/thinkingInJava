package com.company.accessControl;


class WithProtected {
    protected int i;
}

public class ProtectedManipulation {
    public static void main(String[] args) {
        WithProtected wp = new WithProtected();
        wp.i = 47;
        System.out.println("wp.i = " + wp.i);
    }
}
