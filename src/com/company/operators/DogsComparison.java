package com.company.operators;



public class DogsComparison {
    static void compare(Dog dog1, Dog dog2) {
        System.out.println("== on top references: " + (dog1 == dog2));
        System.out.println("equals() on top references: " + dog1.equals(dog2));
        System.out.println("== on names: " + (dog1.name == dog2.name));
        System.out.println("equals() on names: " + (dog1.name.equals(dog2.name)));
        System.out.println("== on says: " + (dog1.says == dog2.says));
        System.out.println("equals() on says: " + (dog1.says.equals(dog2.says)));
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = dog1;

        dog1.name = "Spot";
        dog2.name = "Scruffy";

        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        System.out.println("Compare dog1 and dog2");

        compare(dog1, dog2);

        System.out.println("Compare dog1 and dog3");

        compare(dog1, dog3);

        System.out.println("Compare dog2 and dog3");

        compare(dog2, dog3);

    }
}
