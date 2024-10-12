public class Address {
    private String city;
    private String street;
    private String state;
    private String zip;
    private Address address;

    //Parameterized contructors
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }
    //Copy constructor
    public Address(Address addressCopy){
        this.city = addressCopy.city;
        this.street = addressCopy.street;
        this.state = addressCopy.state;
        this.zip = addressCopy.zip;
    }
    //Default constructor
    public Address() {
        this.city = "Atreia";
        this.street = "Balamatria";
        this.state = "Kahrun";
        this.zip = "1";
    }
    //Getter and Setters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    //Prints Address Information
    public String printAddress() {
        String str = getStreet() + "\n" +
                     getCity()   + ", " +
                     getState()  + ", " +
                     getZip() + "\n";
        return str;
    }
}
