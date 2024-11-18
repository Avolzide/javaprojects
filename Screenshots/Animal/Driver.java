/*
 * David Cortinez
 * Module 5 CLO-8
 * Purpose: is to help me understand the concept of inheritance in Object-Oriented Programming.
 * I will create a simple class hierarchy that demonstrates how inheritance works.
 */
/*
*** Outline ***
* Create a base class called Animal with the following features:

A private instance variable name of type String.

A constructor that takes a String argument to initialize name.

A method makeSound() that prints a generic sound like "Some generic animal sound".

A method getName() that returns the name of the animal.

Create a subclass called Dog that inherits from Animal:

Override the makeSound() method to print "Woof Woof".

Override the toString()

Override the hashCode()

Override the equals()

Create another subclass called Cat that also inherits from Animal:

Override the makeSound() method to print "Meow Meow".

Override the toString()

Override the hashCode()

Override the equals()

In your main method, do the following:

Create 2 instances of Dog;

Output hash code of each

Using the equals method, check to see if the objects are identical

Create 2 instances of Cat;

Output hash code of each

Using the equals method, check to see if the objects are identical

Create an ArrayList (create 2 ArrayLists)  of Dog and Cat objects and populate with the  Dog and Cat objects you
created ealier. Loop through the ArrayLists and output each animal's name, and sound using the toString() method.
 */

import java.util.ArrayList;

public class Driver {
    public static void main(String[] cheese) {

        //Two instances of Dog
        Dog dog1 = new Dog("Air Buddy");
        Dog dog2 = new Dog("Woofy");

        //Output hash code
        System.out.println("Dog1 HashCode: " + dog1.hashCode());
        System.out.println("Dog2 HashCode: " + dog2.hashCode());

        //Check if identical using equals
        System.out.println("Dog1 equals Dog2: " + dog1.equals(dog2));

        //Two instances of Cat
        Cat cat1 = new Cat("Black Cat");
        Cat cat2 = new Cat("Whiskers");

        //Output hash code
        System.out.println("Cat1 HashCode: " + cat1.hashCode());
        System.out.println("Cat2 HashCode: " + cat2.hashCode());

        //Equals method on cats
        System.out.println("Cat1 equals Cat2: " + cat1.equals(cat2));

        //ArrayLists for dog and cat objects
        ArrayList<Dog> dogList = new ArrayList<>();
        ArrayList<Cat> catList = new ArrayList<>();

        //Add to dogList
        dogList.add(dog1);
        dogList.add(dog2);

        //Add to catList
        catList.add(cat1);
        catList.add(cat2);

        //Output dogList
        System.out.println("\nDog List:");
        for (Dog dog : dogList) {

            System.out.println(dog.toString());
            dog.makeSound();
        }

        //Output cat list
        System.out.println("\nCat List:");
        for (Cat cat : catList) {

            System.out.println(cat.toString());
            cat.makeSound();
        }
    }
}
