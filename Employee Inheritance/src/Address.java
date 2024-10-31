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

public class Address {

    //Variables
    private String street;
    private String city;
    private String state;
    private String zip;

    //Default Constructor
    public Address(){

        this.street = "Unknown street";
        this.city = "NA";
        this.state = "None";
        this.zip = "78200";
    }
    //Parameterized constructor
    public Address(String street, String city, String state, String zip){

        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    //Copy constructor
    public Address(Address cAddress){

        this.street = cAddress.street;
        this.city = cAddress.city;
        this.state = cAddress.state;
        this.zip = cAddress.zip;
    }
    //Getters and setters
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    //Prints address
    @Override
    public String toString(){

        return  "\nStreet: " + this.getStreet() +
                "\nCity: " + this.getCity() +
                "\nState: " + this.getState() +
                "\nZip: " + this.getZip();
    }
}
