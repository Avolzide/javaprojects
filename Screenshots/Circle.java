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
class Circle extends Shape {

    //Circle radius variable
    private double radius;

    //Parameterized constructor
    public Circle(String colour, double radius) {

        super(colour);
        this.radius = radius;
    }

    //Getter and setter for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Area of Circle formula
    @Override
    double areaOfShape() {
        return Math.PI * radius * radius;
    }

    //Circumference of Circle
    @Override
    double perimeterOfShape() {
        return 2 * Math.PI * radius;
    }

    //Display all the circles information using the methods
    @Override
    void displayShapeInfo() {

        System.out.print("\nShape: Circle" +
                         "\nColor: " + getColor() +
                         "\nRadius: " + getRadius() +
                         "\nArea: " + areaOfShape() +
                         "\nPerimeter: " + perimeterOfShape());
    }
}
