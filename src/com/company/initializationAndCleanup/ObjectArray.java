package com.company.initializationAndCleanup;

public class ObjectArray {
    public static void main(String args[]) {
        Test[] array = new Test[5];
        for(int i = 0; i < array.length; i++)
            array[i] = new Test(Integer.toString(i));
    }
}
