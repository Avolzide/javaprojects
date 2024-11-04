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

public class Cat extends Animal {

    //Parameterized Constructor
    public Cat(String name) {
        super(name);
    }

    //makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    //toString method
    @Override
    public String toString() {
        return "Cat's name: " + getName();
    }

    //hashCode method
    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    //equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cat cat = (Cat) obj;
        return getName().equals(cat.getName());
    }
}