
//This will be the blueprint for the basic information for any shape
abstract class Shape {
    private String color;

    //Color constructor
    public Shape(String colour){
        this.color = colour;
    }

    //Abstract methods for finding the area and perimeter of different shapes
    abstract double areaOfShape();
    abstract double perimeterOfShape();
    abstract void displayShapeInfo();


    //Getter setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
