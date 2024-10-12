import java.util.Scanner;

public class ppDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Asking user to input info
        Header.displayHeader();
        System.out.println("Enter your first name: ");
        String fName = scan.nextLine();

        System.out.println("Enter your last name: ");
        String lName = scan.nextLine();

        System.out.println("Street: ");
        String street = scan.nextLine();

        System.out.println("City: ");
        String city = scan.nextLine();

        System.out.println("State: ");
        String state = scan.nextLine();

        System.out.println("Zip code: ");
        String zip = scan.nextLine();

        System.out.println("Enter your car make: ");
        String cMake = scan.nextLine();

        System.out.println("Enter your car model: ");
        String cModel = scan.nextLine();

        System.out.println("Enter your car year: ");
        String cYear = scan.nextLine();

        //Instantiating objects
        ParkingPermit parkingPermit = new ParkingPermit(cMake, cModel, cYear);
        Address address = new Address(street, city, state, zip);
        Student student = new Student(fName, lName, address, parkingPermit);
        Address addressCopy = new Address(address);
        ParkingPermit parkingPermitCopy = new ParkingPermit(parkingPermit);

        //Prints out Strings from print methods to read from top to bottom
        System.out.println("\n" + student.printStudentInfo() + "\n" + address.printAddress() + " " + parkingPermit.printPermit());

        //sout for testing the address and permit copy constructor
//        System.out.println("~~~~Copy of Address~~~~\n" + addressCopy.printAddress());
//        System.out.println("~~~~Copy of Parking Permit~~~~\n" + parkingPermitCopy.printPermit());
    }
}
