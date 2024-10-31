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

public class Salary extends Employee{

    //Variables
    private double annualSalary;
    private double monthlyBonus;
    NumberFormat currFmt = NumberFormat.getCurrencyInstance();

    //Default constructor
    public Salary(){

        super();
        this.annualSalary = 0.0;
        this.monthlyBonus = 0.0;
    }

    //Parameterized constructor
    public Salary(String fName, String lName, String eID, Benefit benefit, Address address, double annualSalary, double monthlyBonus){

        super(fName, lName, eID, benefit, address);
        this.annualSalary = annualSalary;
        this.monthlyBonus = monthlyBonus;
    }

    //Copy constructor
    public Salary(Salary salary){

        super(salary);
        this.annualSalary = salary.annualSalary;
        this.monthlyBonus = salary.monthlyBonus;
    }

    //Getters and setters
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
    }

    //Calculate Pay
    public double CalculatePay(double annualSalary, double monthlyBonus){

        double semiPaycheck = this.annualSalary / 24;
        double bonusPerPaycheck = this.monthlyBonus / 2;

        return semiPaycheck + bonusPerPaycheck;
    }
    //Print method
    @Override
    public String printEmployeeInfo(){

        return  super.printEmployeeInfo() +
                "\nSemi Pay: " + currFmt.format(CalculatePay(getAnnualSalary(), getMonthlyBonus()));
    }
}
