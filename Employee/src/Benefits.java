/*
 * David Cortinez
 * Module 3 - Lab 1
 * Purpose: To create an address, benefits, and employee classes and use copy constructors; aggregation
 */
/*
Create variables to hold a userID, first name and last name (all Strings).

instantiate a Benefit object using the 3 argument constructor (your choice on the data). An Example //Benefit would be:

Type: Health

Cost: 495.00

Provider: United Healthcare

instantiate an Address object using the 4 argument constructor (your choice on the data)

prompt the user for userID, first name and last name and store in variables created earlier

instantiate an Employee object using the five argument constructor providing it with the data form the user prompts AND the Benefit object, and Address object you created earlier.

output to the user the Employee data using your printEmployeeInformation method.
 */


import java.text.NumberFormat;

public class Benefits{

    //Variables
    private double cost;
    private String type;
    private String provider;

    //Currency formatter
    NumberFormat currencyFormat = NumberFormat.getCurrencyInstance();

    //Parameterized constructor
    public Benefits(String pType, double pCost, String pProvider) {
        this.cost = pCost;
        this.type = pType;
        this.provider = pProvider;
    }
    //Default constructor
    public Benefits(){
        this.cost = 0.0;
        this.type = "Zero";
        this.provider = "Unknown";
    }
    //Copy constructor
    public Benefits(Benefits otherBenefits) {
        this.cost = otherBenefits.cost;
        this.type = otherBenefits.type;
        this.provider = otherBenefits.provider;
    }
    //Getters and setters
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String printBenefits(){
        String str = "\nType: " + getType() +
                     "\nProvider: " + getProvider() +
                     "\nCost: " + currencyFormat.format(getCost());
        return str;
    }
}
