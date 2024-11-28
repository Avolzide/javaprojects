/*
* David Cortinez
* Module 7 Lab 1
* Purpose: will create a simple RPG (Role-Playing Game). We have different types of characters in our game, each
* with different abilities and attributes.
*
* *** Outline ***
* Part 1: Character Class (Superclass)
Create an abstract class named Character, which will serve as the superclass for all types of characters in the game.

This class should have the following properties:

name: A String representing the character's name.

level: An int representing the character's level.

health: An int representing the character's health.

This class should have the following methods:

attack(): an abstract method that will prints a message that the character is attacking (override in the derived class).

defend(): an abstract method that will print a message that the character is defending (override in the derived class).

Getter and setter methods for each property.

Part 2: Create Subclasses
Create two subclasses of Character: Warrior and Mage.

The Warrior class should have the following additional properties:

strength: An int representing the Warrior's strength.

The Mage class should have the following additional properties:

magic: An int representing the Mage's magic power.

Each subclass should override the attack() and defend() method to display a unique attack or defend style.
* For example, a Warrior might attack with a sword, while a Mage might use a spell. They should also have getter and setter methods for each new property.

Part 3: Implement an Interface
Create an interface named SpecialAbility. This interface should define a method called useAbility().

Next, implement the SpecialAbility interface in the Warrior and Mage classes. In the useAbility() method, print a
* message that describes the character's special ability. For example, a Warrior might have a "Berserker Rage" ability, while a Mage might have a "Time Warp" ability.

Part 4: Main Class
In a main method, create instances of your Warrior and Mage classes, set their properties, and call their methods
* to demonstrate that everything is working as expected. This should include the useAbility() method.
 */

public class Mage extends Character implements SpecialAbility{

    //Variable for mage class
    private int magic;

    //Paramterized constructor
    public Mage(String name, int level, int health, int magic) {
        super(name, level, health);
        this.magic = magic;
    }

    //Using the abstract methods from Character
    @Override
    protected void attack() {
        System.out.println("Attack spell: Paradox");
    }

    @Override
    protected void defend() {
        System.out.println("Cast defense spell: Manaward");
    }

    //Implements special ability
    @Override
    public void useAbility() {
        System.out.println("Limit Break: Soul Resonance");
    }

    //Getters and setters
    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    //Output for display driver
    @Override
    public String toString() {
        return super.toString() + "\nMagic: " + getMagic();
    }
}
