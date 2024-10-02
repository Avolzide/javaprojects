/*
 * David Cortinez
 * 09/18/24
 * Module 2 - lab - 2
 * Purpose: Create a Java class called Car and a corresponding driver program to interact with it
 * Practice with using classes, constructors and methods.
 */

/*
---Outline-----------------------------------------------------------------------------------------
* Ask for brand, model, year, and mileage of vehicle
* Print out the car information
* Ask how many miles will be driven by user and print out
* ---------------------------------------------------------------------------------------------------
 */

public class Car {
    String brand;
    String model;
    int year;
    double mileage;

    //Parameterized Constructor
    public Car(String brand, String model, int year, double mileage){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }
    //Default Constructor
    public Car() {
        this.brand = "Cereal";
        this.model = "Corn Flakes";
        this.year = 0;
        this.mileage = 0;
    }
    //Getter and Setters from IntelliJ
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    //Add new miles to current miles
    public double getDrive(double miles) {
        return this.mileage += miles;
    }
}