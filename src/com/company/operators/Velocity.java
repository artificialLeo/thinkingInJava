package com.company.operators;

public class Velocity {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: Velocity distance time");
            System.exit(1);
        }

        float distance = Float.parseFloat(args[0]);
        float time = Float.parseFloat(args[1]);
        System.out.println("Velocity = " + (distance / time) + "ms" );
    }
}
