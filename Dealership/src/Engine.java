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

public class Engine{
    private String engineType;
    private String horsePower;
    private String fuelType;

    //Parameterized constructor
    public Engine(String engineType, String horsePower, String fuelType){
        this.engineType = engineType;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }
    //Default Constructor
    public Engine(){
        this.engineType = "None";
        this.horsePower = "None";
        this.fuelType = "None";
    }
    //Copy constructor
    public Engine(Engine newEngine){
        this.engineType = newEngine.engineType;
        this.horsePower = newEngine.horsePower;
        this.fuelType = newEngine.fuelType;
    }

    //Getters and setters
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(String horsePower) {
        this.horsePower = horsePower;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
    //Print method
    public String printEngineInfo(){
        String str = "\n# # Engine Information # #\n" +
                     "\nEngine Type: " + engineType +
                     "\nHorsepower: " + horsePower +
                     "\nFuel Type: " + fuelType + "\n" +
                     "\n-------------------------------\n";
        return str;
    }
}