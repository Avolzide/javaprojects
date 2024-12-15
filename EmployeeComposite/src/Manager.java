/*
* David Cortinez
* Module 7 Lab 2
* Purpose:
*
* 1.1. Define a new leaf class, Intern, that implements the Employee interface.

1.2. .1. Define a new leaf class, Manager, that implements the Employee interface. Attributes are empId, Department, and Name

1.3. The Intern's position should always be "Intern.” This should be set inside the Intern class and not be modifiable from outside. The Attributes of the class are Name, position, and universityAttended.

1.4. Implement the showEmployeeDetails() method to print the details of the Intern.

1.5 Implement the showEmployeeDetails() method to print the details of the Manager.

Part 2: Adding new functionality

2.1. Add a countEmployees() method to the CompanyDirectory class. This method should return the total number of employees in the directory.

Part 3: Testing your code

3.1. Create a CompanyDirectory for the software department and add two Developer instances, one Manager instance, and one Intern instance to it.

3.2. Call showEmployeeDetails() on the software department directory to print the details of all the employees.

3.3. Call countEmployees() on the software department directory and print the result.
 */

public class Manager implements Employee{

    //Attributes
    private int empID;
    private String department;
    private String name;

    //Parameterized constructor
    public Manager(int empID, String department, String name) {
        this.empID = empID;
        this.department = department;
        this.name = name;
    }

    //Print out Manager
    @Override
    public void showEmployeeDetails() {

        System.out.println();
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + empID);
        System.out.println("Department: " + department);
        System.out.println();
    }
}