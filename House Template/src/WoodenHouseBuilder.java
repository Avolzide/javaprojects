public class WoodenHouseBuilder extends HouseBuilder {

    protected void buildFoundation() {
        System.out.println("Building a wooden foundation for the house.");
    }

    protected void buildStructure() {
        System.out.println("Building the wooden structure of the house.");
    }

    @Override
    protected void checkStructuralIntegrity() {
        System.out.println("Check for structural integrity");
    }

    protected void addRoof() {
        System.out.println("Adding a wooden roof to the house.");
    }

    protected void addWalls() {
        System.out.println("Adding wooden walls to the house.");
    }

    protected void furnishHouse() {
        System.out.println("Furnishing the wooden house.");
    }
}
