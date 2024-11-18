/*
* David Cortinez
* Module 6 Lab 1
* Purpose: complete the following instructions to add another concrete class to the house building example using the
* Template Method pattern.
 */
/*
***Outline***
* You have been given an existing house building system that uses the Template Method pattern. The system currently supports building wooden houses and brick houses. Your task is to extend the system to include a new type of house: a stone house.

Requirements:

Implement a new class called StoneHouseBuilder that extends the HouseBuilder abstract class.

Provide implementations for the abstract methods defined in the HouseBuilder class to build a stone house. You should define the steps for building the foundation, structure, roof, walls, and furnishing the stone house.

Add any additional methods or attributes that are specific to building a stone house.

Test your implementation by creating a new instance of the StoneHouseBuilder class and calling the buildHouse() method. Ensure that the stone house is built correctly by verifying the output messages.

Note:

You can assume that the existing classes (HouseBuilder, WoodenHouseBuilder, and BrickHouseBuilder) are already implemented correctly.

You can use the existing code provided in the previous example as a reference for your implementation.
 */

public class Driver {

    public static void main(String[] cheese) {

        //Stone house
        StoneHouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        //Wood house
        WoodenHouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        //Brick house
        BrickHouseBuilder brickHouseBuilder = new BrickHouseBuilder();

        //Output for building homes
        System.out.println("*** Stone House ***");
        stoneHouseBuilder.buildHouse();

        System.out.println();

        System.out.println("*** Wood House ***");
        woodenHouseBuilder.buildHouse();

        System.out.println();

        System.out.println("*** Brick House ***");
        brickHouseBuilder.buildHouse();
    }
}
