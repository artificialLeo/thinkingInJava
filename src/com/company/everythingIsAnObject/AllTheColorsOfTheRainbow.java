package com.company.everythingIsAnObject;

/****************** Exercise 11 *****************
 * Turn the AllTheColorsOfTheRainbow example into
 * a program that compiles and runs.
 ************************************************/

public class AllTheColorsOfTheRainbow {
    int colorIndicator;

    void changeColor(int newHue) {
        colorIndicator = newHue;
    }

    public static void main(String[] args) {
        AllTheColorsOfTheRainbow allTheColorsOfTheRainbow = new AllTheColorsOfTheRainbow();
        allTheColorsOfTheRainbow.changeColor(26);
    }
}
