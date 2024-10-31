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

public class Ship{

    //Parent variables
    private String shipName;
    private int shipYear;

    //Default constructor
    public Ship(){
        this.shipName = "Beak";
        this.shipYear = 0;
    }

    //Parameterized constructor
    public Ship(String shipName, int shipYear){
        this.shipName = shipName;
        this.shipYear = shipYear;
    }

    //Getters and setters
    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public int getShipYear() {
        return shipYear;
    }

    public void setShipYear(int shipYear) {
        this.shipYear = shipYear;
    }

    //toString method for printing
    @Override
    public String toString() {

        String str = "Name: " + this.getShipName() +
                     "\nYear: " + this.getShipYear();

        return str;
    }
}