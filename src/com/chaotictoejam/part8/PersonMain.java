package com.chaotictoejam.part8;

public class PersonMain {
    public static void main(String args[]) {
        Person person1 = new Person();

        System.out.println(person1.getAge());
        System.out.println(person1.getName());

        Person person2 = new Person(25, "Jane Smith");
        //System.out.println(person2.getName() + " is " + person2.getAge() + " years old.");
        printPerson(person2); // Calls printPerson passing person2

        System.out.println(person2.getNumberOfPeople());
        System.out.println(person1.getNumberOfPeople());

        // Example of creating an array of the custom class Person
        Person[] people = new Person[2];
        people[0] = person1;
        people[1] = person2;
    }

    // Example of how to create a method using a custom class Person
    public static void printPerson(Person p) {
        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
    }

}
