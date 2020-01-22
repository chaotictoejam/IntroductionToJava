package com.chaotictoejam.part6;

public class ArrayExamples {
    public static void main(String[] args) {
        //elementType[] arrayVariable
        int[] myList;

        //arrayVariable = new elementType[arraySize]
        myList = new int[10];
        // int[] nums = new int[10]; // declaring in one statement
        myList[0] = 1;
        myList[1] = 2;
        myList[2] = 5;

        for(int i = 0; i<myList.length; i++) {
            System.out.println(myList[i]);
        }

        double[] doubleNums = {1.9, 2.5, 7.6, 100.1}; // Array initializer
        double[] doubleNumbers = new double[4];
        doubleNumbers[0] = 1.9;
        doubleNumbers[1] = 2.5;
        doubleNumbers[2] = 7.6;
        doubleNumbers[3] = 100.1;
    }
}
