package com.chaotictoejam.part5;

import java.util.Scanner;

public class MultiplicationQuiz {
    public static void main(String[] args) {
        int number1 = (int)(Math.random()*10); // Generate a number between 0 and 9
        int number2 = (int)(Math.random()*10); // Generate a number between 0 and 9

        Scanner input = new Scanner(System.in);
        System.out.println("What is " + number1 + "*" + number2 + "?");
        int answer = input.nextInt();

        while(number1*number2 != answer) {
            System.out.println("Wrong answer, please try again.");
            answer = input.nextInt();
        }
        System.out.println("Yay! You got it right!");
    }
}
