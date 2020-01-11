package com.chaotictoejam.partfour;

public class ConditionalExamples {
    /*
    Simple method to determine if you should knock on professors door
     */
    public static boolean knockOnDoor(boolean profHere, boolean doorOpen) {
        if(profHere && !doorOpen) {
            return true;
        }
        return false;

        // This can be simplified to one return statement
        // return profHere && !doorOpen;
    }

    /*
    Simple method to determine two integers are equal
     */
    public static boolean integersAreEqual(int x, int y) {
        if(x == y) {
            return true;
        }
        return false;

        // This can be simplified to one return statement
        // return x == y;
    }

    /*
    Simple method to determine an integer is even
     */
    public static boolean numberIsEven(int number) {
        if(number % 2 == 0) {
            return true;
        }
        return false;

        // This can be simplified to one return statement
        // return number % 2 == 0;
    }

    /*
    Simple method to determine an integer is even
     */
    public static void numberIsEvenV2(int number) {
        if(number % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is old");
        }
    }

    public static void main(String[] args) {
        // Ternary operation examples
        System.out.println(knockOnDoor(true, true) ? "Knock" : "Don't knock");
        System.out.println(knockOnDoor(true, false) ? "Knock" : "Don't knock");

        System.out.println(integersAreEqual(15, 15)); // true
        System.out.println(integersAreEqual(10, 11)); // false

        System.out.println(numberIsEven(14)); // true
        System.out.println(numberIsEven(15)); // false

        numberIsEvenV2(14);
        numberIsEvenV2(15);
    }
}
