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

public abstract class Character {

        //Variables
        private String name;
        private int level;
        private int health;

        //Base character actions needed for gameplay to work
        public final void actions() {
            attack();
            defend();
        }
        protected abstract void attack();
        protected abstract void defend();

        //Parameterized constructor
        public Character(String name, int level, int health) {
                this.name = name;
                this.level = level;
                this.health = health;
        }

        //Getters and setters
        public String getName() {
        return name;
        }

        public void setName(String name) {
        this.name = name;
        }

        public int getLevel() {
        return level;
        }

        public void setLevel(int level) {
        this.level = level;
        }

        public int getHealth() {
        return health;
        }

        public void setHealth(int health) {
        this.health = health;
        }

        //String method for driver output
        public String toString() {
                return "Character{" +
                        "name='" + name + '\'' +
                        ", level=" + level +
                        ", health=" + health +
                        '}';
        }
}















