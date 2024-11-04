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

import java.text.NumberFormat;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String userID;
        String fName;
        String lName;

        String type;
        double cost;
        String provider;

        String city;
        String street;
        String state;
        String zip;

        Scanner scan = new Scanner(System.in);

        //User input prompt for user ID, first name and last name
        System.out.println("Enter your user ID: ");
        userID = scan.nextLine();
        System.out.println("Enter your first name: ");
        fName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lName = scan.nextLine();

        System.out.println("What type of insurance: ");
        type = scan.nextLine();
        System.out.println("What is the cost of " + type + ": ");
        cost = scan.nextDouble();
        scan.nextLine();
        System.out.println("Who is the provider: " );
        provider = scan.nextLine();

        System.out.println("Enter your city address: ");
        city = scan.nextLine();
        System.out.println("Enter street address: ");
        street = scan.nextLine();
        System.out.println("Input state address: ");
        state = scan.nextLine();
        System.out.println("Input zip address: ");
        zip = scan.nextLine();

        //Instantiating
        Benefits benefits = new Benefits(type, cost, provider);
        Address address = new Address(city, street, state, zip);
        Employee employee = new Employee(userID, benefits, fName, address, lName);

        //Copy
        Address address2 = new Address(address);
        Benefits benefits2 = new Benefits(benefits);

        System.out.println(employee.printEmployeeInformation());
    }
}