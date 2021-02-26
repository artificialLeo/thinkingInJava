package com.company.controllingExecution;


public class RangeTest {
    private static boolean test(int testval, int begin, int end) {
        return testval >= begin && testval <= end;
    }
    public static void main(String[] args) {
        System.out.println(test(10, 5, 15));
        System.out.println(test(5, 10, 15));
        System.out.println(test(5, 5, 5));
    }
}