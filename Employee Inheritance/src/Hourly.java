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

Calculate Pay - In our fictitious company, our salaried employees are paid 2 times per month (24 total paychecks per year).

Calculate the amount the employee will get paid before taxes. Be sure to include 1/2 of the monthly bonus in each check.

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

public class Hourly extends Employee {

    //Variables
    private double hourlyRate;
    private double hoursPerWeek;
    NumberFormat currFmt = NumberFormat.getCurrencyInstance();

    //Default constructor
    public Hourly(){

        super();
        this.hourlyRate = 0.0;
        this.hoursPerWeek = 0.0;
    }

    //Parameterized constructor
    public Hourly(String fName, String lName, String eID, Benefit benefit, Address address, double hourlyRate, double hoursPerWeek){

        super(fName, lName, eID, benefit, address);
        this.hourlyRate = hourlyRate;
        this.hoursPerWeek = hoursPerWeek;
    }

    //Copy constructor
    public Hourly(Hourly cHourly){

        super(cHourly);
        this.hourlyRate = cHourly.hourlyRate;
        this.hoursPerWeek = cHourly.hoursPerWeek;
    }

    //Getters and setters
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(double hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    //Hourly employee's pay calculator
    public double calculateHourlyPay(double hourlyRate, double hoursPerWeek) {

        final double NORMAL_HOURS = 40.0;
        final double OVERTIME_MULTIPLIER = 1.5;

        double normalPay = Math.min(hoursPerWeek, NORMAL_HOURS) * hourlyRate;

        if(hoursPerWeek > NORMAL_HOURS){

            double overTimeHours = hoursPerWeek - NORMAL_HOURS;
            double overTimeRate = hourlyRate * OVERTIME_MULTIPLIER;
            double overTimePay = overTimeHours * overTimeRate;

            return overTimePay + normalPay;
        }
        return normalPay;
    }

    //Override print method
    @Override
    public String printEmployeeInfo(){

        return  super.printEmployeeInfo() +
                "\nWeekly pay: " + currFmt.format(calculateHourlyPay(this.getHourlyRate(), this.getHoursPerWeek()));

    }
}
