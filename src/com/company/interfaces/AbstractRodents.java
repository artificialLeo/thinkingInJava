package com.company.interfaces;


abstract class Rodent {
    public void hop() {
        System.out.println("Rodent hopping");
    }
    public void scurry() {
        System.out.println("Rodent scurrying");
    }
    public void reproduce() {
        System.out.println("Making more rodents");
    }
    public String toString() {
        return "Rodent";
    }
}

class Mouse extends Rodent {
    @Override
    public void hop() {
        System.out.println("Mouse hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Mouse scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Making more Mice");
    }

    @Override
    public String toString() {
        return "Mouse";
    }
}

class Gerbil extends Rodent {
    @Override
    public void hop() {
        System.out.println("Gerbil hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Gerbil scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Gerbil making more Gerbils");
    }

    @Override
    public String toString() {
        return "Gerbil";
    }
}

class Hamster extends Rodent {
    @Override
    public void hop() {
        System.out.println("Hamster hopping");
    }

    @Override
    public void scurry() {
        System.out.println("Hamster scurrying");
    }

    @Override
    public void reproduce() {
        System.out.println("Hamster making more Hamsters");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}

public class AbstractRodents {
    public static void main(String[] args) {
        Rodent[] rodents = {
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for (Rodent r: rodents) {
            r.hop();
            r.scurry();
            r.reproduce();
            System.out.println(r);
        }

    }
}
