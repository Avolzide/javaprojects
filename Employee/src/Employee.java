/*
David Cortinez
10/02/2024
Module 3 - Lab 1
*/

/*
*---Outline------------------------------------------------------------------------------------------
* Create variables to hold a userID, first name and last name (all Strings).

* Instantiate a Benefit object using the 3 argument constructor (your choice on the data). An Example //Benefit would be:

* Type: Health

* Cost: 495.00

* Provider: United Healthcare

* Instantiate an Address object using the 4 argument constructor (your choice on the data)

* Prompt the user for userID, first name and last name and store in variables created earlier

* Instantiate an Employee object using the five argument constructor providing it with the data form the user prompts AND the Benefit object, and Address object you created earlier.

* Output to the user the Employee data using your printEmployeeInformation method.
-----------------------------------------------------------------------------------------------------
 */
public class Employee {
    //List out variables
    private String employeeID;
    private Benefits employeeBenefits;
    private String firstName;
    private Address employeeAddress;
    private String lastName;

    //Parameterized constructor
    public Employee(String employeeID, Benefits employeeBenefits, String firstName, Address employeeAddress, String lastName){
        this.employeeID = employeeID;
        this.employeeBenefits = employeeBenefits;
        this.firstName = firstName;
        this.employeeAddress = employeeAddress;
        this.lastName = lastName;
    }

    //Getters and Setters
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public Benefits getEmployeeBenefits() {
        return employeeBenefits;
    }

    public void setEmployeeBenefits(Benefits employeeBenefits) {
        this.employeeBenefits = employeeBenefits;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Address getEmployeeAddress() {
        return employeeAddress;
    }

    public void setEmployeeAddress(Address employeeAddress) {
        this.employeeAddress = employeeAddress;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //Prints out employee info string
    public String printEmployeeInformation(){
        String str = "\nEmployee Address: " + employeeAddress+
                     "\nFirst Name: " + firstName +
                     "\nLast Name: " + lastName +
                     "\nEmployee ID: " + employeeID +
                     "\nEmployee Benefits: " + employeeBenefits;
        return str;
    }
}


