/*
 * David Cortinez
 * Module 4 Lab 1
 * Purpose: In this lab, you will create a program to manage the current inventory for a car lot using a Car class with
 * specific attributes (Make, Model, Year, Price). You will use an ArrayList to store 5 Car objects with
 * pre-populated data. The program will have functions to display the entire inventory of the car lot and calculate
 * the total value of all cars in the inventory.
 */
/* ***Outline***
* Preparation:
Create a Car class with the following attributes:

Make (String): The make of the car (e.g., Toyota, Honda, Ford).

Model (String): The model of the car (e.g., Camry, Civic, Mustang).

Year (int): The manufacturing year of the car (e.g., 2023, 2022, 2021).

Price (double): The price of the car in USD (e.g., 25000.00, 35000.00, 40000.00).

Create an ArrayList to store 5 Car objects and pre-populate it with sample car data.

Functionality:

Display Entire Inventory:

Create a function named displayInventory() that will display the entire inventory of the car lot.

The function will iterate through the ArrayList of Car objects and print the details of each car, including its Make, Model, Year, and Price.

The displayed data should be formatted in a clear and presentable manner, making use of formatting functions to enhance readability.

Calculate Total Value:

Create a function named calculateTotalValue() in your main driver that will calculate and display the total value of all cars in the car lot's inventory.

The function will iterate through the ArrayList of Car objects, sum up the prices of all the cars, and display the total value.

The total value should be formatted to show the amount in with appropriate decimal places and separators (e.g., 50,000.00).

Program Execution:

Upon running the program, the inventory of the car lot, along with the total value of all cars, will be displayed automatically.

The data should be formatted in an organized and easy-to-read manner, enhancing the user experience.
 */

import java.util.ArrayList;

import java.util.ArrayList;
import java.text.NumberFormat;

public class CarInventory {

    public static void main(String[] args) {

        //Car inventory in an ArrayList
        ArrayList<Car> carInventory = new ArrayList<Car>();
        carInventory.add(new Car("Ford", "F-150", 2025, 40000));
        carInventory.add(new Car("Toyota", "Camry", 2022, 34000));
        carInventory.add(new Car("Hyundai", "Elantra", 2024, 24000));
        carInventory.add(new Car("Ford", "Focus", 2018, 20000));
        carInventory.add(new Car("Honda", "Civic", 2020, 21000));

        //Calling displayInventory to printout my list of cars
        for (Car myCar : carInventory) {
            System.out.println(myCar.displayInventory());
        }
        System.out.println("****************************************");
        calculateTotalValue(carInventory);
        System.out.println("****************************************");
    }

    //Adds the total value of all vehicles currently in the Arraylist
    public static void calculateTotalValue(ArrayList<Car> carInventory) {
        NumberFormat currencyFmt = NumberFormat.getCurrencyInstance();
        double totalCost = 0.0;

        for (Car cars : carInventory) {
            totalCost += cars.getCarPrice();
        }
        System.out.println("Combined Cost of Vehicles: " + currencyFmt.format(totalCost));
    }
}
