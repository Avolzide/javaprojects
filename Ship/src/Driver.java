/*
 * David Cortinez
 * Module 5 Lab 1
 * Purpose: Designing a ship parent and utilizing super / child to extend the parent's methods to the child
 */
/*
Design a Ship class with the following members:

A field for the name of the ship (a string)

A field for the year that the ship was built (an int)

A constructor and appropriate accessors and mutators

A toString method that displays the ship’s name and the year it was built

Design a CruiseShip class that extends the Ship class. The CruiseShip class should have the following members:

A field for the maximum number of passengers (an int)

A constructor and appropriate accessors and mutators

A toString method that overrides the toString method in the base class. The CruiseShip class’s toString method should display the ship’s name, year, and the maximum number of passengers.

Design a CargoShip class that extends the Ship class. The CargoShip class should have the following members:

A field for the cargo capacity in tonnage (an int)

A constructor and appropriate accessors and mutators

A toString method that overrides the toString method in the base class. The CargoShip class’s toString method should display the ship’s name, year and the ship’s cargo capacity.


Program User prompts:

Prompt user for each attribute of a Cargo and Cruise ship


Program outputs

Output the information of each of the Ships
 */

import java.util.Scanner;
public class Driver {
    public static void main(String[] cheese) {

        //Variables
        String name;
        int year;
        int passengers;
        int tonnage;

        //Scanner is now a boat.
        Scanner boat = new Scanner(System.in);

        //Input
        System.out.println("What is the Cruise ship's name: ");
        name = boat.nextLine();
        System.out.println("What year is your ship: ");
        year = boat.nextInt();
        System.out.println("How many passengers: ");
        passengers = boat.nextInt();
        boat.nextLine();

        //Prints out CruiseShip
        CruiseShip cruiseShip = new CruiseShip(name, year, passengers);
        System.out.println("* * * * * * * * * * *");
        System.out.println(cruiseShip.toString());
        System.out.println("* * * * * * * * * * *");

        //Input
        System.out.println();
        System.out.println("Now what is Cargo ship's name: ");
        name = boat.nextLine();
        System.out.println("What year is the ship: ");
        year = boat.nextInt();
        boat.nextLine();
        System.out.println("How many tons does it carry: ");
        tonnage = boat.nextInt();

        //Prints out CargoShip
        CargoShip cargoShip = new CargoShip(name, year, tonnage);
        System.out.println("* * * * * * * * * * *");
        System.out.println(cargoShip.toString());
        System.out.println("* * * * * * * * * * *");
    }
}
