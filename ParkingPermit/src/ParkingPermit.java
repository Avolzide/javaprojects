import java.util.Random;

public class ParkingPermit {
    //Variables
    private final int permitID;
    private String carMake;
    private String carModel;
    private String carYear;
    private ParkingPermit parkingPermit;


    //Parameterized Constructor
    public ParkingPermit(String pCarMake, String pCarModel, String pCarYear){
        this.permitID = genRandPermitID();
        this.carMake = pCarMake;
        this.carModel = pCarModel;
        this.carYear = pCarYear;
    }

    //Default constructor
    public ParkingPermit(){
        this.permitID = 0;
        this.carMake = "Car";
        this.carModel = "???";
        this.carYear = "0";
    }
    //Copy constructor
    public ParkingPermit(ParkingPermit copy){
        this.permitID = copy.getPermitID();
        this.carMake = copy.carMake;
        this.carModel = copy.carModel;
        this.carYear = copy.carYear;
    }

    private int genRandPermitID(){
        Random rand = new Random();
        return rand.nextInt(9000) + 1000;
    }
    //Getters and setters
    public int getPermitID() { return permitID; }

    public String getCarMake() {
        return carMake;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public String getCarModel() { return carModel; }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getCarYear() {
        return carYear;
    }

    public void setCarYear(String carYear) {
        this.carYear = carYear;
    }

    //Prints car info and parking permit
    public String printPermit() {
        String str = "\n***Permit Details***\n" +
                     "Car Make: " + getCarMake() + "\n" +
                     "Car Model: " + getCarModel() + "\n" +
                     "Car Year: " + getCarYear() + "\n" +
                     "Permit ID: " + getPermitID() + "\n";
        return str;
    }
}