/*
David Cortinez
09/21/2024
Module 2 - Lab - 3
Purpose:  To create a Java program called House with a corresponding Driver
 */
/*
---Outline---------------------------------------------------------------------------------
*  Create the default constructor and parameterized constructor for house
* Create getters and setters for all the variables
* Use price / square foot formula for a method
* Ask for house information with scanner
* Have a number formatter for the money
* Ask for a new price on the house and calculate it
 */

import java.util.Scanner;
import java.text.NumberFormat;

public class Driver {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

        //Ask for information on the house
        System.out.println("Input the home address: ");
        String address = scan.nextLine();
        System.out.println("Enter how many bedrooms the house has: ");
        int numBedrooms = scan.nextInt();
        System.out.println("How many bathrooms: ");
        double numBathrooms = scan.nextDouble();
        System.out.println("What's the price of the house: ");
        double price = scan.nextDouble();
        System.out.println("What's the total area in square feet: ");
        int squareFeet = scan.nextInt();

        House house = new House(address, numBathrooms, numBedrooms, price, squareFeet);

        //Prints house info
        System.out.println("\nHouse Info Below: \n");
        System.out.println("Address: " + house.getAddress());
        System.out.println("Number of Bedrooms: " + house.getNumBedrooms());
        System.out.println("Number of Bathrooms: " + house.getNumBathrooms());
        System.out.println("Price: " + currencyFormat.format(house.getPrice()));
        System.out.println(("Total area: " + house.getSquareFeet()) + " sqr ft");
        System.out.println("Price per square foot: " + currencyFormat.format(house.calculatePricePerSqrFt()));

        //Ask for a new price on the home
        System.out.println("\nEnter your new price for the home: ");
        double newPrice = scan.nextDouble();
        house.setPrice(newPrice);
        //Print new home price info
        System.out.println("New Price: " + currencyFormat.format(house.getPrice()));
        System.out.println("New Price per square foot: " + currencyFormat.format(house.calculatePricePerSqrFt()));

    }
}
