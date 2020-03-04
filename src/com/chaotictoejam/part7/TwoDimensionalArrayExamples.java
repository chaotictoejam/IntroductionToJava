package com.chaotictoejam.part7;

public class TwoDimensionalArrayExamples {
    public static int[][] getMatrix(int rowLength, int colLength) {
        int[][] matrix = new int[rowLength][colLength];

        for(int row = 0; row < matrix.length; row++){ // Loops through the rows
            for(int column = 0; column < matrix[row].length; column++){ // Loops through the columns for that specific row
                matrix[row][column] = (int)(Math.random()*100); // Sets value to a random number between 0 and 99
            }
        }

        // Returns initialized array with random values
        return  matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for(int row = 0; row < matrix.length; row++) { // Loops through the rows
            for (int column = 0; column < matrix[row].length; column++) { // Loops through the columns for that specific row
                System.out.print(matrix[row][column] + " "); // Out prints the specific row/column number
            }
            System.out.println(); // Line break so next row is on a new line
        }
    }

    public static int sumMatrix(int[][] matrix) {
        int total = 0;
        for(int row = 0; row < matrix.length; row++) { // Loops through the rows
            for (int column = 0; column < matrix[row].length; column++) { // Loops through the columns for that specific row
                total += matrix[row][column]; // Add the specific row/column number to our total
            }
        }
        return total;
    }

    public static void main(String[] args) {
        int[][] matrix = getMatrix(5, 5);
        printMatrix(matrix);
        System.out.println("The sum of our matrix is: " + sumMatrix(matrix));
    }
}
