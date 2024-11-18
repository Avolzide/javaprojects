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

import java.text.NumberFormat;
import java.util.Objects;

class Doctor extends MedicalProvider {

    //Variables
    private double yearlySalary;
    private String specialty;
    private String licenseNumber;
    NumberFormat currFmt = NumberFormat.getCurrencyInstance();

    //Parameterized constructor
    public Doctor(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation, String specialty, String licenseNumber, double yearlySalary) {

        super(firstName, lastName, employeeID, employeeOfficeLocation);
        this.specialty = specialty;
        this.licenseNumber = licenseNumber;
        this.yearlySalary = yearlySalary;
    }

    //Default constructor
    public Doctor(){

        this.specialty = "What specialty?";
        this.licenseNumber = "Zero";
        this.yearlySalary = 0.0;
    }

    //Copy constructor
    public Doctor(Doctor doctor){

        super(doctor.firstName, doctor.lastName, doctor.employeeID, doctor.employeeOfficeLocation);
        this.specialty = doctor.specialty;
        this.licenseNumber = doctor.licenseNumber;
        this.yearlySalary = doctor.yearlySalary;
    }

    //Getters and setters
    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    //Used abstract method to calculate yearly salary per week
    @Override
    double payEmployee() {

        double weeklyPay = this.yearlySalary / 52;

        return weeklyPay;
    }

    //Print out parent toString and Doctor
    @Override
    public String toString() {
        return super.toString() +
                "\nSpecialty: " + getSpecialty() +
                "\nLicense Number: " + getLicenseNumber() +
                "\nWeekly Pay: " + currFmt.format(payEmployee()) +
                "\n***************************";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor = (Doctor) o;
        return Double.compare(yearlySalary, doctor.yearlySalary) == 0 && Objects.equals(specialty, doctor.specialty) && Objects.equals(licenseNumber, doctor.licenseNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), yearlySalary, specialty, licenseNumber);
    }
}
