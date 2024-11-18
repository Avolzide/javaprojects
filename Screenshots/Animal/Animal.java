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
public class Animal {

    //Variable
    private String name;

    //Parameterized constructor
    public Animal(String name) {

        this.name = name;
    }

    //Generic sound
    public void makeSound(){

        System.out.println("Irregular noise");
    }

    //Getter
    public String getName() { return name; }

}
