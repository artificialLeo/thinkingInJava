package com.company.controllingExecution;
/****************** Exercise 6 ******************
 * Modify the two test() methods in the previous
 * two programs so they take two extra
 * arguments, begin and end, and so testval is
 * tested to see if it is within the range between
 * (and including) begin and end.
 ************************************************/

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