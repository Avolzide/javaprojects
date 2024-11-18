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

import java.util.ArrayList;

public class Driver {

    public static void main(String[] cheese) {

        ArrayList<MedicalProvider> medicalProviders = new ArrayList<>();

        //Two Office locations to use
        OfficeLocation officeLocation1 = new OfficeLocation("Global Medical", "123 Tywon Road", "San Antonio", "Texas", "78222");
        OfficeLocation officeLocation2 = new OfficeLocation("Healthy Ville", "782 Oakly Spires", "San Antonio", "Texas", "78235");

        //Two doctors
        medicalProviders.add(new Doctor("John", "James", "b2837679", officeLocation1, "Internal Medicine", "7815649254", 125000.00));
        medicalProviders.add((new Doctor("Honey", "Bee", "a7263518", officeLocation2, "Cardiologist", "4523185462", 150000.00)));

        //Two nurses
        medicalProviders.add(new Nurse("Marth", "Tia", "j2934718", officeLocation1, "RN", 25.0, 45));
        medicalProviders.add(new Nurse("Thancred", "Waters", "s8273645", officeLocation2, "LVN", 30.0, 40));

        //For each list
        for(MedicalProvider medicalProvider: medicalProviders){

            System.out.println(medicalProvider);
        }
    }
}
