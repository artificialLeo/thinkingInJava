package com.company.initializationAndCleanup;

enum PaperCurrencyTypes {
    ONE, TWO, FIVE, TEN, TWENTY, FIFTY
}

public class PaperCurrencyTypesEnum {
    public static void main(String[] args) {
        for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
}
