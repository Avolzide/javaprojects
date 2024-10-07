public class Address {
    private String city;
    private String street;
    private String state;
    private String zip;

    //Parameterized contructors
    public Address(String city, String street, String state, String zip) {
        this.city = city;
        this.street = street;
        this.state = state;
        this.zip = zip;
    }
    //Copy constructor
    public Address(Address otherAddress){
        this.city = otherAddress.city;
        this.street = otherAddress.street;
        this.state = otherAddress.state;
        this.zip = otherAddress.zip;
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
    public String toString() {
        String str = "\nCity: " + getCity() +
                     "\nStreet: " + getStreet() +
                     "\nState: " + getState() +
                     "\nZip: " + getZip();
        return str;
    }
}
