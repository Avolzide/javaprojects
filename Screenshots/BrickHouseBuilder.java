public class BrickHouseBuilder extends HouseBuilder {
    @Override
    protected void buildFoundation() {
        System.out.println("Flattening for foundation");
    }

    @Override
    protected void buildStructure() {
        System.out.println("Building structure for brick building");
    }

    @Override
    protected void checkStructuralIntegrity() {
        System.out.println("Hiring professional for integrity check");
    }

    @Override
    protected void addRoof() {
        System.out.println("Building a roof");
    }

    @Override
    protected void addWalls() {
        System.out.println("Building brick walls");
    }

    @Override
    protected void furnishHouse() {
        System.out.println("Furnishing brick house with brick furniture");
    }
}
