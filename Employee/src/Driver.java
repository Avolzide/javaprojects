import java.text.NumberFormat;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        String userID;
        String fName;
        String lName;

        Scanner scan = new Scanner(System.in);

        //Instantiating Benefits and Address and hardcoding info
        Benefits benefits = new Benefits("Health", 230, "Bloo X");
        Address address = new Address("San Antonio", "110 Hunted Land", "Texas", "78222");

        //User input prompt for user ID, first name and last name
        System.out.println("Enter your user ID: ");
        userID = scan.nextLine();
        System.out.println("Enter your first name: ");
        fName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lName = scan.nextLine();

        //Instantiating Employee
        Employee employee = new Employee(userID, benefits, fName, address, lName);

        System.out.println(employee.printEmployeeInformation());
    }
}