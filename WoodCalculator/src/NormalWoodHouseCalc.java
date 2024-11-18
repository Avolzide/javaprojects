public class NormalWoodHouseCalc {

    private int length;
    private int width;
    private int walls;
    private int height;

    public NormalWoodHouseCalc(int length, int width, int walls, int height) {

        this.length = length;
        this.width = width;
        this.walls = walls;
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWalls() {
        return walls;
    }

    public void setWalls(int walls) {
        this.walls = walls;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int normalWoodCalcFoundationAndCeiling(){

        return 4 * (getLength() * getWidth());
    }

    public int normalWoodCalcWalls(){

        return 2 * ((getLength() * getWidth()) * getWalls());

    }

    public int normalWoodStructure(){

        int xBeams = (getLength() - 1) * getWidth() * getHeight();

        // Beams along the Y-axis (vertical within each layer)
        int yBeams = (getWidth() - 1) * getLength() * getHeight();

        // Beams along the Z-axis (between layers)
        int zBeams = (getHeight() - 1) * getWidth() * getHeight();

        // Total unique beams
        return (xBeams + yBeams + zBeams) * 2;

    }

    public int woodTotal(){
        return normalWoodCalcWalls() + normalWoodCalcFoundationAndCeiling() + normalWoodStructure();
    }
}
