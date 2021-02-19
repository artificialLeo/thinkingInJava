package com.company.operators;

/****************** Exercise 5 *****************
 * Create a class called Dog with two Strings:
 * name and says. In main(), create two dogs,
 * "spot" who says, "Ruff!", and "scruffy" who
 * says, "Wurf!". Then display their names and
 * what they say.
 ***********************************************/

class Dog {
    String name;
    String says;
}

public class TwoDogs {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "Spot";
        dog2.name = "Scruffy";

        dog1.says = "Ruff!";
        dog2.says = "Wurf!";

        System.out.printf("name dog1: %s", dog1.name);
        System.out.println();
        System.out.printf("name dog2: %s", dog2.name);
        System.out.println();
        System.out.printf(" dog1 barks: %s", dog1.says);
        System.out.println();
        System.out.printf("dog2 barks: %s", dog2.says);
    }
}
