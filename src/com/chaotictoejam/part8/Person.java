package com.chaotictoejam.part8;

public class Person {
    private int age; // Defaults to 0
    private String name;
    private static int numberOfPeople; // This value is shared across all Person objects

    public Person() {
        age = 0;
        name = "John Doe";
        numberOfPeople++; // Increments total count Person objects created
    }

    public Person(int age, String name) {
        this.age = age; // Sets age to passed value
        this.name = name;
        numberOfPeople++; // Increments total count Person objects created
    }

    // Returns age for specific instance of Person
    public int getAge() {
        return age;
    }

    // Returns name for specific instance of Person
    public String getName() {
        return name;
    }

    // Returns numberOfPeople, this value is shared across all Person objects
    public static int getNumberOfPeople() {
        return numberOfPeople;
    }
}
