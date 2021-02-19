package com.company.everythingIsAnObject;

/****************** Exercise 10 ****************
 Everything is an Object 15
 * Write a program that prints three arguments
 * taken from the command line.
 * You'll need to index into the command-line
 * array of Strings.
 ***********************************************/

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
