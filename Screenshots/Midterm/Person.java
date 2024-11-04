// Modifier: David Cortinez
// Added in two new variables gpa and phoneNum,
// Included gpa and phoneNum into the default contructor with a default value,
// Added the two variables into the Parameterized constructor as default values,
// Created a new constructor to add the two new variables into the parameters to use,
// Added getters and setters for the new parameters,
// Formatted the PrintData to use commas in the toString
// Used gpa and phoneNum getters into the PrintData

/**
 * Person Class
 * 	Class contains: First name, Last name, and age
 */
public class Person {
    //Attributes/fields
    private String firstName;
    private String lastName;
    private int personAge;
    private double gpa;
    private String phoneNum;
    /**************************************
     * Constructors
     **************************************/
    //Constructors (Default)
    public Person()
    {
        firstName = "None";
        lastName = "None";
        personAge = 0;
        gpa = 0.0;
        phoneNum = "Unknown";
    }
    //Constructors (Populates data with arguments)
    public Person(String pFirst, String pLast, int pAge)
    {
        setFirstName(pFirst);
        setLastName(pLast);
        setPersonAge(pAge);
        gpa = 0.0;
        phoneNum = "Unknown";

    }

    public Person(String nFirst, String nLast, int nAge, double nGpa, String nPhoneNum){

        firstName = nFirst;
        lastName = nLast;
        personAge = nAge;
        gpa = nGpa;
        phoneNum = nPhoneNum;
    }
    /**************************************
     * Getters/Setters
     **************************************/
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

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**************************************
     * Methods
     **************************************/
    public String PrintData()
    {
        String myReturn = "";
        myReturn += "Name: " + getFirstName() + " " + getLastName() + ", ";
        myReturn += "Age: " + getPersonAge() + ", ";
        myReturn += "GPA: " + getGpa() + ", ";
        myReturn += "Phone Number: " + getPhoneNum();
        return myReturn;
    }

} // END Person Class