package com.company.interfaces;


interface Rodent2 {
    void hop();
    void scurry();
    void reproduce();
}

class Mouse2 implements Rodent2 {
    @Override
    public void hop() {
        System.out.println("Mouse Hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Mouse Scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Mice");
    }

    @Override
    public String toString() { return "Mouse"; }

//    void hop(); // it's all initially public!!
//    void scurry();
//    void reproduce();
}

class Gerbil2 implements Rodent2 {
        @Override
    public void hop() {
        System.out.println("Gerbil Hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Gerbil Scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Gerbils");
    }

    @Override
    public String toString() { return "Gerbil"; }
}

class Hamster2 implements Rodent2 {
        @Override
    public void hop() {
        System.out.println("Hamster Hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Hamster Scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Hamsters");
    }

    @Override
    public String toString() { return "Hamster"; }
}

public class RodentInterface {
    public static void main(String[] args) {
        Rodent2[] rodent2 = {
                new Mouse2(),
                new Gerbil2(),
                new Hamster2()
        };

        for (Rodent2 r : rodent2) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }
    }
}
