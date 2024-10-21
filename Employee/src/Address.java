/*
* David Cortinez
* Module 3 - Lab 1
* Purpose: To create an address, benefits, and employee classes and use copy constructors; aggregation
*/
/*
Create variables to hold a userID, first name and last name (all Strings).

instantiate a Benefit object using the 3 argument constructor (your choice on the data). An Example //Benefit would be:

Type: Health

Cost: 495.00

Provider: United Healthcare

instantiate an Address object using the 4 argument constructor (your choice on the data)

prompt the user for userID, first name and last name and store in variables created earlier

instantiate an Employee object using the five argument constructor providing it with the data form the user prompts AND the Benefit object, and Address object you created earlier.

output to the user the Employee data using your printEmployeeInformation method.
 */

public class Address {
    private String city;
    private String street;
    private String state;
    private String zip;

    //Parameterized contructors
    public Address(String city, String street, String state, String zip) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.zip = zip;
    }
    //Copy constructor
    public Address(Address otherAddress){
        this.city = otherAddress.city;
        this.street = otherAddress.street;
        this.state = otherAddress.state;
        this.zip = otherAddress.zip;
    }
    //Default constructor
    public Address() {
        this.city = "Atreia";
        this.street = "Balamatria";
        this.state = "Kahrun";
        this.zip = "1";
    }
    //Getter and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
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

    //Prints Address Information
    public String printAddress() {
        String str = getStreet() + "\n" +
                     getCity()   + ", " +
                     getState()  + ", " +
                     getZip();
        return str;
    }
}
