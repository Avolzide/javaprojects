/*
 * David Cortinez
 * 09/18/24
 * Module 2 - lab - 2
 * Purpose: Create a Java class called Car and a corresponding driver program to interact with it
 * Practice with using classes, constructors and methods.
 */
/*
/*
---Outline-----------------------------------------------------------------------------------------
* Ask for brand, model, year, and mileage of vehicle
* Print out the car information
* Ask how many miles will be driven by user and print out
* ---------------------------------------------------------------------------------------------------
 */
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Type in the car brand:  ");
        String brand = scan.nextLine();
        System.out.println("Next type in car model: ");
        String model = scan.nextLine();
        System.out.println("What year is the car: ");
        int year = scan.nextInt();
        System.out.println("How many miles does it have: ");
        double mileage = scan.nextDouble();

        Car car = new Car(brand, model, year, mileage);

        System.out.println("\nBrand: " + car.getBrand());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        System.out.println("Current miles: " + car.getMileage());

        System.out.println("How many more miles are you driving this car: ");
        double milesToDrive = scan.nextDouble();
        car.getDrive(milesToDrive);
        System.out.println("New milage on vehicle: " + car.getMileage());

    }
}