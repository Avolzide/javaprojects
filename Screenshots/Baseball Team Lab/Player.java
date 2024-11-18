/*
 * David Cortinez
 * Module 5 Lab 3
 * Purpose: The goal of this assignment is to understand the concept of inheritance in Object-Oriented Programming (OOP).
 * You will create a class hierarchy to represent different roles within a baseball team, demonstrating how inheritance
 * can be used to manage these roles.
 */
/*
*** Outline ***
* Base Class - TeamMember: Create a base class named TeamMember with the following features:

Private instance variables for name (String) and jerseyNumber (int).

A constructor that initializes name and jerseyNumber.

An override the method toString() that prints the name and jersey number of the team member.

Subclass - Player: Create a subclass named Player that inherits from TeamMember:

Add an additional private instance variable for position (String).

A constructor that initializes name, jerseyNumber, and position.

Override the toString() method to also display the player's position.

Override the equals() method to compare players.

Subclass - Coach: Create another subclass named Coach that also inherits from TeamMember:

Add an additional private instance variable for role (String - head coach, assistant coach etc.).

A constructor that initializes name, jerseyNumber, and role.

Override the tostring() method to display the coach's role.

Override the equals() method to compare coaches.

Main Method: In your main method, perform the following tasks:

Create an instance of Player and call its toString() method.

Create an instance of Coach and call its toString() method.
*/

public class Player extends TeamMember {

    //Variable
    private String position;

    //Default constructor
    public Player(){

        super();
        this.position = "BenchWarmer";
    }

    //Parameterized constructor
    public Player(String name, int jerseyNumber, String position) {
        super(name, jerseyNumber);
        this.position = position;
    }

    //Getters and setters
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //Prints out Team Member info and player's position
    @Override
    public String toString() {
        return  super.toString() +
                "\nPosition: " + getPosition();
    }

    //Checks if player objects are the same
    @Override
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Player player = (Player) obj;
        return position.equals(player.position);
    }
}
