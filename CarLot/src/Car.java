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

public class Car{

    //Variables
    private String carMake;
    private String carModel;
    private int carYear;
    private double carPrice;

    //Parameterized constructor
    public Car(String carMake, String carModel, int carYear, double carPrice){
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
        this.carPrice = carPrice;
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

    public int getCarYear() {
        return carYear;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }

    public double getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    //Print out
    public String displayInventory(){
        String str = "\nCar Make: " + carMake +
                     "\nCarModel: " + carModel +
                     "\nCar Year: " + carYear +
                     "\nCar Price: " +  carPrice +
                     "\n-------------------------";
        return str;
    }
}