package com.company.reusingClasses;

class Amphibian {
    public void swim() {
        System.out.println("SWIM!");
    }

    public void jump() {
        System.out.println("JUMP!");
    }
}

class TestFroggy extends Amphibian {}

public class Frog {
    public static void main(String[] args) {
        Amphibian t = new Amphibian();
        t.jump();
        t.swim();
    }
}
