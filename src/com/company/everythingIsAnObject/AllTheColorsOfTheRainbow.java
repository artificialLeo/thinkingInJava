package com.company.everythingIsAnObject;



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
