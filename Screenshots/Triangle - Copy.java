/*
* David Cortinez
* Module 6 CLO 3/4
* Purpose: Develop a hierarchy of shape classes demonstrating inheritance and polymorphism in object-oriented programming.
*
* ***Outline***
Base Class - Shape:

Create an abstract class Shape with common attributes like color and methods such as area() and perimeter(), which will be overridden in derived classes (these methods will be abstract).

Include an abstract method to display shape information.

Derived Classes:

Implement three derived classes (e.g., Circle, Rectangle, Triangle).

Note - you will need to determine what attributes are appropriate for each class

Each derived class should override the area() and perimeter() methods with specific implementations.

Inheritance:

Demonstrate the use of inheritance where derived classes inherit properties and methods from the Shape class.

Polymorphism:

Implement polymorphism by using a generic Shape reference  to interact with derived class objects (Consider using an Arraylist)

Demonstrate how the same method (like area()) can behave differently based on the shape object it's called upon.

Testing:

Create a test driver/main method to instantiate different shapes (Shape class).

Display the properties and call the methods of each shape to validate polymorphism and inheritance.

Documentation:

Document the code with comments explaining the purpose of each class and method. Ensure each class/method and useage is explained within the comments of your program. Your comments will demonstrate your understanding of the classes.
 */

//This subclass inherit methods and color from Shape parent
class Triangle extends Shape {

    //Three side variables for a triangle
    private double sideA;
    private double sideB;
    private double sideC;

    //Parameterized constructor
    public Triangle(String colour, double sideA, double sideB, double sideC) {
        super(colour);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    //Getters and setters
    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    //Area of a triangle formula
    @Override
    double areaOfShape() {
        double s = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    //Perimeter of a triangle formula
    @Override
    double perimeterOfShape() {
        return sideA + sideB + sideC;
    }


    //Print out all the triangle information to display
    @Override
    void displayShapeInfo() {

        System.out.print("Shape: Triangle" +
                "\nColor: " + getColor() +
                "\nSideA: " + getSideA() +
                "\nSideB " + getSideB() +
                "\nSideC: " + getSideC() +
                "\nArea: " + areaOfShape() +
                "\nPerimeter: " + perimeterOfShape());

    }
}
