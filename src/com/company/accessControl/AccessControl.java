package com.company.accessControl;

public class AccessControl {
    public int a;
    private int b;
    protected int c;
    int d; // Package access
    public void f1() {}
    private void f2() {}
    protected void f3() {}
    void f4() {} // Package access
    public static void main(String args[]) {
        AccessControl test = new AccessControl();
        // No problem accessing everything inside
        // of main() for this class, since main()
        // is a member and therefore has access:
        test.a = 1;
        test.b = 2;
        test.c = 3;
        test.d = 4;
        test.f1();
        test.f2();
        test.f3();
        test.f4();
    }
}

class Other {
    public Other() {
        AccessControl test = new AccessControl();
        test.a = 1;
        //! test.b = 2; // Can't access: private
        test.c = 3;
        test.d = 4;
        test.f1();
        //! test.f2(); // Can't access: private
        test.f3();
        test.f4();
    }
}

class E05_Other {
    public E05_Other() {
        AccessControl test = new AccessControl();
        test.a = 1;
        //! test.b = 2; // Can't access: private
        //! test.c = 3; // Can't access: protected
        //! test.d = 4; // Can't access: package
        test.f1();
        //! test.f2(); // Can't access: private
        //! test.f3(); // Can't access: protected
        //! test.f4(); // Can't access: package
    }
}