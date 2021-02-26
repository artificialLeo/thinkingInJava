package com.company.controllingExecution;

public class FindPrimes {
    public static void main(String[] args) {
        int max = 1000;

        if (args.length != 0) {
            max = Integer.parseInt(args[0]);
        }
        for (int i = 1; i < max; i++) {
            boolean prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.println(i + " ");
            }
        }
    }
}
