package com.company.initializationAndCleanup;
/****************** Exercise 22 ****************
 * Write a switch statement for the enum in
 * Exercise 21. For each case, output a
 * description of that particular currency.
 ***********************************************/

public class PaperCurrencyTypesEnum2 {
    static void describe(PaperCurrencyTypes pct) {
        System.out.println(pct + " has a portrait of ");
        switch (pct) {
            case ONE:
                System.out.println("George Washington");
                break;
            case TWO:
                System.out.println("Thomas Jefferson");
                break;
            case FIVE:
                System.out.println("Abraham Lincoln");
                break;
            case TEN:
                System.out.println("Alexander Hamilton");
                break;
            case TWENTY:
                System.out.println("Andrew Jackson");
                break;
            case FIFTY:
                System.out.println("U.S. Grant");
                break;
        }
    }

    public static void main(String[] args) {
        for(PaperCurrencyTypes s : PaperCurrencyTypes.values())
            describe(s);
    }

}
