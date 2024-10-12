public class Student {
    //Variables
    private String firstName;
    private String lastName;
    private Address address;
    private ParkingPermit parkingPermit;

    //Parameterized constructor
    public Student(String pFirstName, String pLastName, Address pAddress, ParkingPermit pParkingPermit){
        this.firstName = pFirstName;
        this.lastName = pLastName;
        this.address = pAddress;
        this.parkingPermit = pParkingPermit;
    }

    //Getters and setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ParkingPermit getParkingPermit() {
        return parkingPermit;
    }

    public void setParkingPermit(ParkingPermit parkingPermit) {
        this.parkingPermit = parkingPermit;
    }

    //Print student class with details
    public String printStudentInfo() {
        String str = "***Student Details***\n" + firstName + " " + lastName;
        return str;
    }
}