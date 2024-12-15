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

import java.util.ArrayList;
import java.util.List;

public class CompanyDirectory implements Employee{

    //Employee List
    private List<Employee> employeeList = new ArrayList<>();

    //Counts number of employees
    public int countEmployees(){
        return employeeList.size();
    }

    //Print out List
    @Override
    public void showEmployeeDetails() {
        for (Employee emp : employeeList) {
            emp.showEmployeeDetails();
        }
    }

    //Method for adding employee 
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    }
}
