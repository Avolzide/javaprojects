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

public class House {
    private String address;
    private int numBedrooms;
    private double numBathrooms;
    private double price;
    private int squareFeet;

    //Parameterized constructor
    public House(String address, double numBathrooms, int numBedrooms, double price, int squareFeet) {
        this.address = address ;
        this.numBathrooms = numBathrooms;
        this.numBedrooms = numBedrooms;
        this.price = price;
        this.squareFeet = squareFeet;
    }

    //Default constructor
    public House() {
        this.address = "";
        this.numBathrooms = 0;
        this.numBedrooms = 0;
        this.price = 0.0;
        this.squareFeet = 0;
    }

    //Getter and setters from IntelliJ
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public double getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(double numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSquareFeet() {
        return squareFeet;
    }

    public void setSquareFeet(int squareFeet) {
        this.squareFeet = squareFeet;
    }
    //Simple math for price per square foot method
    public double calculatePricePerSqrFt() {
        return (double) price / squareFeet;
    }
}