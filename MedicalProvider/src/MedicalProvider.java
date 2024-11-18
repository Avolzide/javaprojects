import java.util.Objects;

public abstract class MedicalProvider {

    String firstName;
    String lastName;
    String employeeID;
    OfficeLocation employeeOfficeLocation;

    public MedicalProvider(String firstName, String lastName, String employeeID, OfficeLocation employeeOfficeLocation) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.employeeOfficeLocation = employeeOfficeLocation;
    }

    public MedicalProvider(){

        this.firstName = "What name?";
        this.lastName = "Unknown";
        this.employeeID = "What ID?";
        this.employeeOfficeLocation = new OfficeLocation();
    }

    public MedicalProvider(MedicalProvider cMedicalProvider){

        this.firstName = cMedicalProvider.firstName;
        this.lastName = cMedicalProvider.lastName;
        this.employeeID = cMedicalProvider.employeeID;
        this.employeeOfficeLocation = new OfficeLocation(cMedicalProvider.employeeOfficeLocation);
    }

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

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public OfficeLocation getEmployeeOfficeLocation() {
        return employeeOfficeLocation;
    }

    public void setEmployeeOfficeLocation(OfficeLocation employeeOfficeLocation) {
        this.employeeOfficeLocation = employeeOfficeLocation;
    }

    public String toString(){

        return  "\n*** Medical Provider ***" +
                "\nFirst Name: " + getFirstName() +
                "\nLast Name: " + getLastName() +
                "\nEmployee ID: " + getEmployeeID() +
                "\nOffice Location: " + getEmployeeOfficeLocation();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MedicalProvider that = (MedicalProvider) o;
        return Objects.equals(firstName, that.firstName) && Objects.equals(lastName, that.lastName) && Objects.equals(employeeID, that.employeeID) && Objects.equals(employeeOfficeLocation, that.employeeOfficeLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, employeeID, employeeOfficeLocation);
    }

    public abstract void payEmployee();
}
