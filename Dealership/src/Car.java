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

public class Car {
    private String carMake;
    private  String carModel;
    private String carYear;
    private Engine engine;

    //Parameterized constructor
    public Car(String carMake, String carModel, String carYear, Engine engine){
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
        this.engine = engine;
    }
    //Default constructor
    public Car(){
        this.carMake = "Generic";
        this.carModel = "Unknown";
        this.carYear = "Unknown";
        this.engine = new Engine();
    }
    //Copy Constructor
    public Car(Car copyCar){
        this.carMake = copyCar.carMake;
        this.carModel = copyCar.carModel;;
        this.carYear = copyCar.carYear;
        this.engine = copyCar.engine;
    }

    //Getters and setters
    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    //Print method
    public String printCarInfo(){
        String str = "\n# # Car Information # #\n" +
                     "\nCar Make: " + carMake +
                     "\nCar Model: " + carModel +
                     "\nCar Year: " + carYear + "\n" +
                     "\n-------------------------------\n";
        return str;
    }
}
