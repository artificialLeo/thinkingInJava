package com.company.strings;

import java.util.Formatter;

class Turtle {
    private final String name;
    private final Formatter f;

    public Turtle(String name, Formatter f) {
        this.name = name;
        this.f = f;
    }

    public void move(int x, int y) {
        f.format("%s, The Turtle is at (%d%d)\n", name, x, y);
    }
}


public class TurtleRedirected {
    public static void main(String[] args) {
        Formatter f = new Formatter(System.err);
        Turtle tommy = new Turtle("Tommy", f),
               terry = new Turtle("Terry", f);

        tommy.move(0, 0);
        tommy.move(1, 0);
        tommy.move(0, 1);
        terry.move(0, 0);
        terry.move(0, 1);
        terry.move(1, 0);
    }
}