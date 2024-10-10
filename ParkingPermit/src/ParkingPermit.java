import java.util.Random;

public class ParkingPermit {
    private int permitID;
    private String carMake;
    private String carModel;
    private String carYear;

    Random rand = new Random();
    //Parameterized Constructor
    public ParkingPermit(String pCarMake, String pCarModel, String pCarYear){
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
        this.permitID = copy.permitID;
        this.carMake = copy.carMake;
        this.carModel = copy.carModel;
        this.carYear = copy.carYear;
    }
    //Getters and setters
    public int getPermitID() {

    return rand.nextInt(1000, 9999);
    }

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
}