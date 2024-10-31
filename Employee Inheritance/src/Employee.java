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

public class Employee {

    //Variables
    private String firstName;
    private String lastName;
    private String employeeID;
    private Benefit benefit;
    private Address address;

    //Default constructor
    public Employee(){

        this.firstName = "Stanley";
        this.lastName = "Parable";
        this.employeeID = "Employee 427";
        this.benefit = new Benefit();
        this.address = new Address();
    }

    //Parameterized constructor
    public Employee(String fName, String lName, String eID, Benefit bene, Address addr){

        this.firstName = fName;
        this.lastName = lName;
        this.employeeID = eID;
        this.benefit = bene;
        this.address = addr;
    }

    //Copy constructor
    public Employee(Employee cEmployee){

        this.firstName = cEmployee.firstName;
        this.lastName = cEmployee.lastName;
        this.employeeID = cEmployee.employeeID;
        this.benefit = cEmployee.benefit;
        this.address = cEmployee.address;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //Print employee
    public String printEmployeeInfo(){

        return  "\n***Employee Information***" +
                "\nFirst Name: " + this.getFirstName() +
                "\nLast Name: " + this.getLastName() +
                "\nEmployee ID: " + this.getEmployeeID() +
                "\n***Benefits*** " + this.getBenefit() +
                "\n***Address*** " + this.getAddress();
    }
}

