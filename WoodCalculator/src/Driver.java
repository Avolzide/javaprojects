//Make an abstract class for building my simple houses with different types of wood subclasses
//Use perimeter formula for the foundation
//Use perimeter formula for the walls
//Use perimeter formula for the ceiling
//Use perimeter formula for the two sides of the roof ( two rectangles )
//Add in 1 half corner for every 1 square height for roof later
//Add doors and windows to the calculator later

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        int length;
        int width;
        int walls;
        int height;

        Scanner scan = new Scanner(System.in);

        System.out.println("## Normal Wood House Builder with proper structure beams added (no roof calc included)##\n");
        //System.out.println("What type of wood?");
        System.out.println("How many squares wide?");
        width = scan.nextInt();
        System.out.println("How many squares length?");
        length = scan.nextInt();
        System.out.println("What's the height?");
        height = scan.nextInt();
        System.out.println("Here's the amount of material you need for the basics: ");

        NormalWoodHouseCalc normalWoodHouseCalc = new NormalWoodHouseCalc(length, width, 4, height);

        System.out.println("You need " + normalWoodHouseCalc.woodTotal() + " pieces of wood");

    }
}
