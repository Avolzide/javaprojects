//This subclass inherit methods and color from Shape parent
class Rectangle extends Shape {

    //Length and width variables for a rectangle
    private double length;
    private double width;

    //Parameterized constructor
    public Rectangle(String colour, double length, double width) {
        super(colour);
        this.length = length;
        this.width = width;
    }

    //Getters and setters
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //Area of a rectangle formula
    @Override
    double areaOfShape() {
        return length * width;
    }

    //Perimeter formula for rectangle
    @Override
    double perimeterOfShape() {
        return (length + width) * 2;
    }

    //Print out all rectangle information to display
    @Override
    void displayShapeInfo() {

        System.out.print("\nShape: Rectangle" +
                         "\nColor: " + getColor() +
                         "\nLength: " + getLength() +
                         "\nWidth: " + getWidth() +
                         "\nArea: " + areaOfShape() +
                         "\nPerimeter: " + perimeterOfShape());

    }
}
