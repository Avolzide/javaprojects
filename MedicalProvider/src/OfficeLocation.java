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

public class OfficeLocation {

    private String locationName;
    private String streetAddress;
    private String city;
    private String state;
    private String zip;

    public OfficeLocation(String locationName, String streetAddress, String city, String state, String zip) {
        this.locationName = locationName;
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    public OfficeLocation(){

        this.locationName = "Unknown";
        this.streetAddress = "123 Where?";
        this.city = "What city?";
        this.state = "Which state?";
        this.zip = "Need a zip code";
    }

    public OfficeLocation(OfficeLocation cOfficeLocation){

        this.locationName = cOfficeLocation.locationName;
        this.streetAddress = cOfficeLocation.streetAddress;
        this.city = cOfficeLocation.city;
        this.state = cOfficeLocation.state;
        this.zip = cOfficeLocation.zip;
    }

    public String getLocationName() {
        return locationName;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
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

    public String toString(){
        return "\nOffice Location: " + getLocationName() +
                "\n" + getStreetAddress() +
                ", " + getCity() +
                ", " + getState() +
                ", " + getZip() ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OfficeLocation that = (OfficeLocation) o;
        return Objects.equals(locationName, that.locationName) && Objects.equals(streetAddress, that.streetAddress) && Objects.equals(city, that.city) && Objects.equals(state, that.state) && Objects.equals(zip, that.zip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(locationName, streetAddress, city, state, zip);
    }
}