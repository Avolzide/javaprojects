import java.text.NumberFormat;

public class Benefits{
    private double cost;
    private String type;
    private String provider;

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
        this.type = "";
        this.provider = "";
    }
    //Copy constructor
    public Benefits(Benefits otherBenefits) {
        this.cost = otherBenefits.cost;
        this.type = otherBenefits.type;
        this.provider = otherBenefits.provider;
    }

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

    @Override
    public String toString(){
        String str = "\nType: " + getType() +
                     "\nProvider: " + getProvider() +
                     "\nCost: " + currencyFormat.format(getCost());
        return str;
    }
}
