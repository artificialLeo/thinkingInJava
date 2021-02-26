package com.company.everythingIsAnObject;



public class StaticTestInstance {
    static int i = 1;

    public static void main(String[] args) {
        StaticTestInstance staticTestInstance1 = new StaticTestInstance();
        StaticTestInstance staticTestInstance2 = new StaticTestInstance();

        System.out.println(staticTestInstance1.i + " == " + staticTestInstance2.i);
        staticTestInstance1.i++;
        System.out.println(staticTestInstance1.i + " == " + staticTestInstance2.i);
    }
}
