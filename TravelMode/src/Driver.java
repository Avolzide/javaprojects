public class Driver {
    public static void main(String[] args) {
        System.out.println("Walking:");
        var serviceOne = new DirectionService(new Walk());
        serviceOne.getETA();
        serviceOne.getDirection();
        System.out.println("Bus:");
        serviceOne.setTravelMode(new Bus() );
        serviceOne.getETA();
        serviceOne.getDirection();
        //TODO - demonstrate the Bicycle Class - you will need to create the Bicycle class
        // Note the Bicycle class returns 2 and implements the getETA and getDirection
        //TODO - demonstrate the Drive Class - - you will need to create the Drive class
        // Note the Drive class returns 1 and implements the getETA and getDirection
    }
}