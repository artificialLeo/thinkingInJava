package com.company.everythingIsAnObject;


public class ShowArgs {
    public static void main(String[] args) {
        System.out.println(args.length);

        if ( args.length < 3 ) {
            System.err.println("Not enough arguments!");
        } else {
            System.out.println(args[0]);
            System.out.println(args[1]);
            System.out.println(args[2]);
        }
    }
}
