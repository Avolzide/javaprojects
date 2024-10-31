/*
 * David Cortinez
 * Module 5 Lab 2
 * Purpose: Create 2 sub-classes of an Employee for this Lab. The sub-classes will both inherit from the Employee Class.
 * The following two classes will need to be created. Aggregated classes have copy constructors and they are used in the
 * appropriate places.
 */
/*
*** Outline ***
* Salary

Attributes:

Annual Salary (getters/setters)

Monthly Bonus (getters/setters)

Constructor

Constructor to populate all arguments

Additional Methods

Calculate Pay - In our fictitious company, our salaried employees are paid 2 times per month (24 total paychecks per year). Calculate the amount the employee will get paid before taxes. Be sure to include 1/2 of the monthly bonus in each check.

Override the PrintEmployeeInformation() of the Employee class to also print the employee's gross pay for the pay period.

* Hourly

Attributes:

Hourly rate (getters/setters)

Hours worked per week (getters/setters) - Remember to calculate overtime (Overtime is time and a half for every hour over 40)

Constructor

Constructor to populate all arguments

Additional Methods

Calculate Pay - in our fictitious  company, our hourly employees are paid every week. Calculate the amount the employee will get paid before taxes for a week. Please be aware of overtime pay.

Override the PrintEmployeeInformation() of the Employee class to also print the employees gross pay for the week.

* Create a Driver Program to demonstrate the use of each of the classes (Salary and Hourly). For the Driver Program,
* you do not need to get any user input - simply invoke the needed constructors and print the information for each
* type of employee.
 */

import java.text.NumberFormat;

public class Benefit {

    //Variables
    private double cost;
    private String type;
    private String provider;

    //Currency formatter
    NumberFormat currFmt = NumberFormat.getCurrencyInstance();

    //Default constructor
    public Benefit(){

        this.cost = 0.0;
        this.type = "Unknown";
        this.provider = "Unknown";
    }

    //Parameterized constructor
    public Benefit(double cost, String type, String provider){

        this.cost = cost;
        this.type = type;
        this.provider = provider;
    }

    //Copy constructor
    public Benefit(Benefit cBenefit){

        this.cost = cBenefit.cost;
        this.type = cBenefit.type;
        this.provider = cBenefit.provider;
    }

    //Getters and setters
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public NumberFormat getCurrFmt() {
        return currFmt;
    }

    public void setCurrFmt(NumberFormat currFmt) {
        this.currFmt = currFmt;
    }

    //Prints benefits
    @Override
    public String toString(){

        return  "\nCost: " + currFmt.format(this.getCost()) +
                "\nType: " + this.getType() +
                "\nProvider: " + this.getProvider();
    }
}
