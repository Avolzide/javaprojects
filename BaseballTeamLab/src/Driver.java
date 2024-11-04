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

public class Driver {

    public static void main(String[] cheese) {

        //Roster
        Player player = new Player("Y'shtola", 1, "Forward");
        Coach coach = new Coach("Louis", 0, "Coach");
        Player player2 = new Player("Thancred", 2, "Goalie");

        //Output
        System.out.println(player2.toString());
        System.out.println(player.toString());
        System.out.println(coach.toString());
        System.out.println();
//        System.out.println("Coach is coach: (" + coach.equals(coach) + ")");
//        System.out.println("Player is coach: (" + player.equals(coach) + ")");
//        System.out.println("Player is player: (" + player.equals(player)+ ")");
//        System.out.println("Coach is player: (" + coach.equals(player) + ")");
    }
}
