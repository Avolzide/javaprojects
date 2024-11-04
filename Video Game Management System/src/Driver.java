/*
 * David Cortinez
 * Module 4 Lab 3
 * Purpose: In this lab, you will create a program to manage a collection of video games using a VideoGame class
 * with specific attributes (Title, Genre, Platform, and Price). The program will use an ArrayList to store VideoGame
 * objects. The assignment will include functions to add new video games to the inventory, display the entire inventory
 * of video games, and allow users to search for games by their title or platform.
 */
/* *** Outline ***
* Preparation:
Create a VideoGame class with the following attributes:

Title (String): The title of the video game.

Genre (String): The genre/category of the video game.

Platform (String): The platform on which the video game can be played (e.g., PC, Xbox One, PS4, Nintendo Switch).

Price (double): The price of the video game in USD.

Create an ArrayList to store VideoGame objects.

Functionality in your main/driver:

Add Video Games:

Create a function named addGame() that allows the user to add new video games to the inventory.

The function will prompt the user to enter the Title, Genre, Platform, and Price of the video game they want to add.

The entered information will be used to create a new VideoGame object, which will be added to the ArrayList.

Display Entire Inventory:

Create a function named displayInventory() that will display the entire inventory of video games.

The function will iterate through the ArrayList of VideoGame objects and print the details of each game, including its Title, Genre, Platform, and Price.

The displayed data should be formatted in a clear and presentable manner, making use of formatting functions to enhance readability.

Search by Title:

Create a function named searchByTitle() that allows the user to search for video games by their title.

The function will prompt the user to enter the title they want to search for.

The program will then search the ArrayList of VideoGame objects for all games with a matching title and display the details of each matching game.

Search by Platform:

Create a function named searchByPlatform() that allows the user to search for video games by their platform.

The function will prompt the user to enter the platform they want to search for.

The program will then search the ArrayList of VideoGame objects for all games playable on the specified platform and display the details of each matching game.

Program Execution:

Upon running the program, the user will be presented with a menu of options to perform various operations on the video game inventory. Provide the user with a selection to exit the program in your menu. The menu will repeat until the user enters the selection to exit.

The user can add new video games to the inventory, display the entire inventory, or search for games by their title or platform.

Please show your test of each function in your output
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

        ArrayList<VideoGame> theVideoGame = new ArrayList<>();
        Scanner select = new Scanner(System.in);

        int pick = -1;

        //Switch statement for assigning menu buttons
        do {
            try {
                System.out.println("# # # Video Game Management System # # #");
                System.out.println("(1) Add a video game");
                System.out.println("(2) Display Inventory");
                System.out.println("(3) Search title");
                System.out.println("(4) Search platform");
                System.out.println("(5) Exit");
                System.out.println("\nWhich menu function are we using? Enter a number: ");
                pick = select.nextInt();

                switch (pick) {
                    case 1:
                        addGame(theVideoGame);
                        break;
                    case 2:
                        displayInventory(theVideoGame);
                        break;
                    case 3:
                        searchByTitle(theVideoGame);
                        break;
                    case 4:
                        searchByPlatform(theVideoGame);
                        break;
                    case 5:
                        System.out.println("Exiting..");
                        break;
                    default:
                        System.out.println("Invalid input");
                }
            } catch(InputMismatchException e) {
                System.out.println("\nError: Please enter a valid number\n");
                select.nextLine();
            }
            //Exits program
        }while (pick != 5);
    }

    //Add game prompt
    public static void addGame(ArrayList<VideoGame> addVideoGame) {

        Scanner scan = new Scanner(System.in);

        //Variables
        String title;
        String genre;
        String platform;
        double price;

        System.out.println("\nEnter the game's title: ");
        title = scan.nextLine();
        System.out.println("What is the game's genre: ");
        genre = scan.nextLine();
        System.out.println("Which platform is it played on: ");
        platform = scan.nextLine();
        System.out.println("How much does it cost: ");
        price = scan.nextDouble();

        addVideoGame.add(new VideoGame(title, genre, platform, price));
    }

    //Displays the list of games added to the ArrayList
    public static void displayInventory(ArrayList<VideoGame> displayVideoGame) {
        System.out.println("vvv List of Current Video Games vvv\n");
        for (VideoGame myVideoGame : displayVideoGame) {
            System.out.println(myVideoGame.printVideoGameInfo());
        }
        System.out.println("^^^ End of List ^^^\n");
    }

    //Search function by a game's title
    public static void searchByTitle(ArrayList<VideoGame> examineTitle) {

        Scanner hunt = new Scanner(System.in);
        String searchString;
        boolean titleFound = false;

        System.out.println("Search by title: ");
        searchString = hunt.nextLine();

        for(VideoGame videoGame : examineTitle){
            if(videoGame.getVideoGameTitle().equals(searchString)){
                System.out.println("\nFound it!!!\n");
                System.out.println(videoGame.printVideoGameInfo());
                titleFound = true;
            }
        }
        //Boolean feedback for not finding the title
        if(!titleFound){
            System.out.println("\n>>> Not found <<<\n");
        }
        System.out.println("^^^ End of Search ^^^");
    }
    //Search function by platform function
        public static void searchByPlatform(ArrayList<VideoGame> examinePlatform) {

            Scanner hunt = new Scanner(System.in);
            String searchString;
            boolean platformFound = false;

            System.out.println("Search by platform: ");
            searchString = hunt.nextLine();

            for(VideoGame videoGame : examinePlatform){
                if(videoGame.getVideoGamePlatform().equals(searchString)){
                    System.out.println("\nPlatform found!\n");
                    System.out.println(videoGame.printVideoGameInfo());
                    platformFound = true;
                }
            }
            //Boolean feedback for not finding the platform
            if(!platformFound) {
                System.out.println("\n>>> Not found <<<\n");
            }
            System.out.println("^^^ End of Search ^^^");
        }
}
