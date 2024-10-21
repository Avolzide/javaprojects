/*
 * David Cortinez
 * Module 3 Lab Dealership
 * Purpose The primary objective of this lab assignment is to strengthen your understanding of object-oriented
 * programming in Java, with an emphasis on the concept of aggregation. The theme for this assignment revolves
 * around cars and their various components. As always, you will make use of the Scanner class to collect user input.
 */
/* ***Outline***
* Create the Engine class: This class will have the attributes: engineType, horsePower, and fuelType.

 1.1. All attributes will be set by user input.

 1.2. Include appropriate getter and setter methods for these attributes.

Create the Car class: This class will have the attributes: carMake, carModel, carYear, and engine.

 2.1. The carMake, carModel, and carYear attributes will be set by user input.

 2.2. The engine attribute will be an object of the Engine class.

 2.3. Include appropriate getter and setter methods for these attributes.

Create the Dealership class: This class will have the attributes: dealershipName, location, and car.

 3.1. The dealershipName and location attributes will be set by user input.

 3.2. The car attribute will be an object of the Car class.

 3.3. Include appropriate getter and setter methods for these attributes.

Write your main program:

 4.1. Use the Scanner class to collect user input for the engine's type, horsepower, and fuel type, the car's make, model, and year, and the dealership's name and location.

 4.2. Instantiate the Engine, Car, and Dealership classes with the information provided by the user.

 4.3. Finally, output the information about the dealership, the car, and its engine in a clear and descriptive format.
 */

public class Dealership {
    //Variables
    private String dealershipName;
    private String location;
    private Car car;

    //Parameterized constructor
    public Dealership(String dealershipName, String location, Car car){
        this.dealershipName = dealershipName;
        this.location = location;
        this.car = car;
    }
    //Default constructor
    public Dealership(){
        this.dealershipName = "None";
        this.location = "Unknown";
        this.car = new Car();
    }
    //Copy constructor
    public Dealership(Dealership copyDealership){
        this.dealershipName = copyDealership.dealershipName;
        this.location = copyDealership.location;
        this.car = copyDealership.car;
    }

    //Getters and setters
    public String getDealershipName() {
        return dealershipName;
    }

    public void setDealershipName(String dealershipName) {
        this.dealershipName = dealershipName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    //Print method
    public String printDealershipInfo(){
        String str = "\n# # Dealership Information # #\n" +
                     "\nDealership Name: " + dealershipName +
                     "\nLocation: " + location + "\n" +
                     "\n-------------------------------\n";
        return str;
    }
}
