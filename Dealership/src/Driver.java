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

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        String engineType;
        String horsePower;
        String fuelType;

        String carMake;
        String carModel;
        String carYear;

        String dealershipName;
        String location;

        //User inputs
        System.out.println("What's your car's engine type: ");
        engineType = scan.nextLine();
        System.out.println("What is it's horse power: ");
        horsePower = scan.nextLine();
        System.out.println("What type of fuel does the car use: ");
        fuelType = scan.nextLine();

        System.out.println("What is your car make: ");
        carMake = scan.nextLine();
        System.out.println("What is the car model: ");
        carModel = scan.nextLine();
        System.out.println("What year is the car: ");
        carYear = scan.nextLine();

        System.out.println("Which dealership is the car from: ");
        dealershipName = scan.nextLine();
        System.out.println("Where's the dealership's location: ");
        location = scan.nextLine();

        //Instantiation
        Engine engine = new Engine(engineType, horsePower, fuelType);
        Car car = new Car(carMake, carModel, carYear, engine);
        Dealership dealership = new Dealership(dealershipName, location, car);

        //Copy
        Engine engine2 = new Engine(engine);
        Car car2 = new Car(car);
        Dealership dealership2 = new Dealership(dealership);

        //engine2.setEngineType("Motor");

        //Output
        System.out.println(engine.printEngineInfo() + car.printCarInfo() + dealership.printDealershipInfo());

        //System.out.println("\n\n~~Copy~~\n" +engine2.printEngineInfo() + car2.printCarInfo() + dealership2.printDealershipInfo());
    }
}
