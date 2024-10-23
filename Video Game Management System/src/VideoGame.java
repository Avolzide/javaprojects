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

public class VideoGame{

    //Variables
    private String videoGameTitle;
    private String videoGameGenre;
    private String videoGamePlatform;
    private double videoGamePrice;

    //Parameterized constructor
    public VideoGame(String videoGameTitle, String videoGameGenre, String videoGamePlatform, double videoGamePrice){
        this.videoGameTitle = videoGameTitle;
        this.videoGameGenre = videoGameGenre;
        this.videoGamePlatform = videoGamePlatform;
        this.videoGamePrice = videoGamePrice;
    }

    //Default constructor
    public VideoGame(){
        this.videoGameTitle = "Supersonic Acrobatic Rocket-powered Battle-cars";
        this.videoGameGenre = "Sports";
        this.videoGamePlatform = "Playstation 3";
        this.videoGamePrice = 19.99;
    }

    //Getters and setters
    public String getVideoGameTitle() {
        return videoGameTitle;
    }

    public void setVideoGameTitle(String videoGameTitle) {
        this.videoGameTitle = videoGameTitle;
    }

    public String getVideoGameGenre() {
        return videoGameGenre;
    }

    public void setVideoGameGenre(String videoGameGenre) {
        this.videoGameGenre = videoGameGenre;
    }

    public String getVideoGamePlatform() {
        return videoGamePlatform;
    }

    public void setVideoGamePlatform(String videoGamePlatform) {
        this.videoGamePlatform = videoGamePlatform;
    }

    public double getVideoGamePrice() {
        return videoGamePrice;
    }

    public void setVideoGamePrice(double videoGamePrice) {
        this.videoGamePrice = videoGamePrice;
    }
    public String printVideoGameInfo(){
        String str = "***** Video Game Information *****" +
                     "\nTitle    ==>     " + getVideoGameTitle() +
                     "\nGenre    ==>     " + getVideoGameGenre() +
                     "\nPlatform ==>     " + getVideoGamePlatform() +
                     "\nPrice    ==>     " + getVideoGamePrice() +
                     "\n**********************************\n";
        return str;
    }
}