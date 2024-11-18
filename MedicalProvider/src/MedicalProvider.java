/*
* David Cortinez
* Module 6 Lab 2
* Purpose: Create an application based on the following UML Class diagram
*
* Create an application with the following Classes:

OfficeLocation

Medical Provider (base class - Abstract) - This object has an OfficeLocation (Class). Additionally, the MedicalProvider has an abstract method payEmployee()

Doctor inherits from Medical Provider

Nurse inherits form Medical Provider

Doctor

Shown Above in the Object Diagram - note the Weekly Gross Pay (note this is calculated based on Annual Salary)

Doctor specialty is (Internal Medicine, Cardiologist, Orthopedic, etc.)

Nurse

Shown Above in the Object Diagram - note the Weekly Gross Pay is calculated on how many hours worked, and pay rate (please handle overtime - time and a half for all hours over 40)

Nurse Type is (RN, LVN, MA, etc.)

Program User prompts:

The Driver Class can call the parameterized Constructor - you do not need to get user input for the Driver class. The Driver class will need to use an ArrayList to hold 4 MedicalProviders (polymorphism) 2 doctors and 2 nurses.

Program outputs

Display the list of medical providers as shown above
 */

import java.util.Objects;

public abstract class MedicalProvider {

    //Variables
    String firstName;
    String lastName;
    String employeeID;
    OfficeLocation employeeOfficeLocation;

    //Parameterized constructor
    public MedicalProvider(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.employeeOfficeLocation = new OfficeLocation(employeeOfficeLocation);
    }

    //Default
    public MedicalProvider(){

        this.firstName = "What name?";
        this.lastName = "Unknown";
        this.employeeID = "What ID?";
        this.employeeOfficeLocation = new OfficeLocation();
    }

    //Copy constructor
    public MedicalProvider(MedicalProvider cMedicalProvider){

        this.firstName = cMedicalProvider.firstName;
        this.lastName = cMedicalProvider.lastName;
        this.employeeID = cMedicalProvider.employeeID;
        this.employeeOfficeLocation = new OfficeLocation(cMedicalProvider.employeeOfficeLocation);
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

    public OfficeLocation getEmployeeOfficeLocation() {
        return employeeOfficeLocation;
    }

    public void setEmployeeOfficeLocation(OfficeLocation employeeOfficeLocation) {
        this.employeeOfficeLocation = employeeOfficeLocation;
    }

    public String toString(){

        return "\n" + getClass().getSimpleName() + " Name: " + getFirstName() + " " + getLastName() +
                "\nEmployee ID: " + getEmployeeID() +
                "\n" + getEmployeeOfficeLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalProvider that = (MedicalProvider) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(employeeID, that.employeeID) && Objects.equals(employeeOfficeLocation, that.employeeOfficeLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, employeeID, employeeOfficeLocation);
    }

    abstract double payEmployee();
}