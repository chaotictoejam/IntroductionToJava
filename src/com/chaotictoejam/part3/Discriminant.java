package com.chaotictoejam.part3;

/**
 * Class to illustrate the use of methods and simple math functions
 */

import java.util.Scanner;

public class Discriminant {

    public static double calculateDiscriminant(double a, double b, double c) {
        return b*b - 4*a*c;
    }

    public static void main(String[] args) {
        // Step 1: Read in a, b, and c
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for a: ");
        double a = input.nextDouble();

        System.out.print("Enter a number for b: ");
        double b = input.nextDouble();

        System.out.print("Enter a number for c: ");
        double c = input.nextDouble();

        // Step 2: Compute the discriminant (b^2-4ac)
        // double discriminant = b*b - 4*a*c;
        // Another way to write this is using the Math library function pow() see below
        // double discriminate = Math.pow(b, 2) - 4*a*c;

        double discriminant = calculateDiscriminant(a, b, c);

        System.out.print("The discriminant is: " + discriminant);

        input.close();
    }
}
