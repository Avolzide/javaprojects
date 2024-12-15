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

class Nurse extends MedicalProvider{

    NumberFormat currFmt = NumberFormat.getCurrencyInstance();
    private String type;
    private double hourlyWage;
    private double hoursWorked;

    public Nurse(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation, String type, double hourlyWage, double hoursWorked) {

        super(firstName, lastName, employeeID, employeeOfficeLocation);
        this.type = type;
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public Nurse() {

        this.type = "What type?";
        this.hourlyWage = 0.00;
        this.hoursWorked = 0.00;
    }

    public Nurse(Nurse nurse){

        super(nurse);
        this.type = nurse.type;
        this.hourlyWage = nurse.hourlyWage;
        this.hoursWorked = nurse.hoursWorked;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Nurse nurse = (Nurse) o;
        return Double.compare(hourlyWage, nurse.hourlyWage) == 0 && Double.compare(hoursWorked, nurse.hoursWorked) == 0 && Objects.equals(type, nurse.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), type, hourlyWage, hoursWorked);
    }

    @Override
    double payEmployee() {

        final double NORMAL_HOURS = 40.0;
        final double OVERTIME_MULTIPLIER = 1.5;

        double normalPay = Math.min(hoursWorked, NORMAL_HOURS) * hourlyWage;

        if(hoursWorked > NORMAL_HOURS){

            double overTimeHours = hoursWorked - NORMAL_HOURS;
            double overTimeRate = hourlyWage * OVERTIME_MULTIPLIER;
            double overTimePay = overTimeHours * overTimeRate;

            return overTimePay + normalPay;
        }
        return normalPay;
    }

    //Printout for hourly wage Nurse
    @Override
    public String toString() {
        return super.toString() +
                "\nType: " + getType() +
                "\nHours Worked: " + getHoursWorked() +
                "\nHourly Rate: " + currFmt.format(getHourlyWage()) +
                "\nWeekly Pay: " + currFmt.format(payEmployee()) +
                "\n***************************";
    }
}
