package com.company.everythingIsAnObject;

public class DataOnlyPrint {
    int i;
    double d;
    boolean b;

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();

        dataOnly.i = 1;
        System.out.println( "dataOnly.i = " + dataOnly.i);
        dataOnly.d = 1.1;
        System.out.println( "dataOnly.d = " + dataOnly.d);
        dataOnly.b = false;
        System.out.println( "dataOnly.b = " + dataOnly.b);
    }
}
