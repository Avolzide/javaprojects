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

public class Driver {

    public static void main(String[] cheese) {

        //Salaried Employee #1
        Salary salary0 = new Salary("Thancred", "Waters", "tww282",
                         new Benefit(300.0,"Health", "Sharlayan"),
                         new Address("Hunt Land 1235", "San Antonio", "TX", "78222"),
                        50000.0, 2000);

        //Salaried Employee #2
        Salary salary1 = new Salary("Y'shtola", "Rhul", "bal829",
                         new Benefit(500, "Life", "Baldesion"),
                         new Address("Iddlyshire 2000", "Austin", "TX", "78201"),
                         80000.0, 5000);

        //Hourly Employee #1

        Hourly hourly0 = new Hourly("Alisaie", "Leveilleur", "hkd8252",
                         new Benefit(250, "Dental", "Crystarium"),
                         new Address("Old Sharlyan 102 Blvd", "Houston", "TX", "77001"),
                         12.50, 30);

        //Hourly Employee #2

        Hourly hourly1 = new Hourly("G'raha", "Tia", "mqt055",
                         new Benefit(400, "Medical", "Seventh Dawn"),
                         new Address("Labyrinthos 8929", "Underworld City", "Eorzea", "298"),
                         22.0, 48);


        //Prints salaried and hourly employees
        System.out.println(salary0.printEmployeeInfo());
        System.out.println();
        System.out.println(salary1.printEmployeeInfo());
        System.out.println();
        System.out.println(hourly0.printEmployeeInfo());
        System.out.println();
        System.out.println(hourly1.printEmployeeInfo());
    }
}
