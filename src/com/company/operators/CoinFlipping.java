package com.company.operators;

import java.util.Random;

/****************** Exercise 7 *****************
 * Write a program that simulates coin-flipping.
 ***********************************************/

public class CoinFlipping {
    public static void main(String[] args) {

        Random rand = new Random();
        boolean flip = rand.nextBoolean();

        System.out.println("OUTCOME: ");
        System.out.println(flip ? "HEAD" : "TAIL");
    }
}
