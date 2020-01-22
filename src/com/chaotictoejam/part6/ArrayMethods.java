package com.chaotictoejam.part6;

public class ArrayMethods {
    public static double[] randomizeArray(int numberOfElements) {
        double[] numbers = new double[numberOfElements];
        for(int i = 0; i<numbers.length; i++) {
            numbers[i] = Math.random()*100; // Random number between 0 and 100.0
        }
        return numbers;
    }

    public static double sumArray(double[] nums) {
        double sum = 0;
        for(int i = 0; i<nums.length; i++) {
            // sum = sum + nums[i];
            sum += nums[i];
        }
        return sum;
    }

    public static double findMax(double[] nums) {
        double max = nums[0];
        for(int i = 1; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        double[] numbers = randomizeArray(10);
        System.out.println(sumArray(numbers));
        System.out.println(findMax(numbers));
    }
}
