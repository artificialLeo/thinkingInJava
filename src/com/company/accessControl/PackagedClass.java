package com.company.accessControl;

public class PackagedClass {
    protected static void greeting() {
        System.out.println("Hello client programmer!");
    }
}

class ConsumerInSamePackage {
    public static void main(String[] args) {
        PackagedClass.greeting();
    }
}

class ForeignClass {
    public static void main(String[] args) {
        PackagedClass.greeting();
    }
}