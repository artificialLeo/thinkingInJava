package com.company.reusingClasses;

class Frog2 extends Amphibian {
    public void swim() {
        System.out.println("I am swimming now");
    }

    public void jump() {
        System.out.println("I am jumping now");
    }
}

public class Froggy2 {
    public static void main(String[] args) {
        Amphibian a = new Frog2();
        a.jump();
        a.swim();
    }
}
