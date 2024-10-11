import java.util.Scanner;

public class ppDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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

        ParkingPermit parkingPermit = new ParkingPermit(cMake, cModel, cYear);
        Address address = new Address(street, city, state, zip);
        Student student = new Student(fName, lName, address, parkingPermit);
        Address addressTwo = new Address(address);

        System.out.println(student.printStudentInfo() + "\n" + address.printAddress() + " " + parkingPermit.printPermit());
    }
}
