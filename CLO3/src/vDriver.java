/*
* David Cortinez
* Module 3 - CLO2
* Purpose:  Object-oriented programming in Java, particularly the concept of aggregation. This assignment
            will focus on creating and manipulating classes that represent elements in a video game world.
*/
/*
* Create the Character class: This class will have the attributes: characterName, characterType, and hitPoints.

 1.1. All attributes will be set by user input.

 1.2. Include appropriate getter and setter methods for these attributes.

Create the VideoGame class: This class will have the attributes: gameName, genre, and mainCharacter.

 2.1. The gameName and genre attributes will be set by user input.

 2.2. The mainCharacter attribute will be an object of the Character class.

 2.3. Include appropriate getter and setter methods for these attributes.

Create the GameStudio class: This class will have the attributes: studioName, location, and publishedGame.

 3.1. The studioName and location attributes will be set by user input.

 3.2. The publishedGame attribute will be an object of the VideoGame class.

 3.3. Include appropriate getter and setter methods for these attributes.

Write your main program:

 4.1. Use the Scanner class to collect user input for the character's name, type, and hit points, the video game's name and genre, and the game studio's name and location.

 4.2. Instantiate the Character, VideoGame, and GameStudio classes with the information provided by the user.

 4.3. Finally, output the information about the game studio, the published video game, and the main character in a clear and engaging format.*/

import java.util.Scanner;

public class vDriver {
    public static void main(String[] args) {

        //Variables
        String characterName;
        String characterType;
        int hitPoints;
        String gameName;
        String genre;
        String studioName;
        String location;

        Scanner scan = new Scanner(System.in);

        //User input
        System.out.println("\nEnter your character name: ");
        characterName = scan.nextLine();

        System.out.println("\nEnter your character class: ");
        characterType = scan.nextLine();

        System.out.println("\nAdd character's hit point value: ");
        hitPoints = scan.nextInt();
        scan.nextLine();

        System.out.println("\nWhat's the video game name: ");
        gameName = scan.nextLine();

        System.out.println("\nWhat's it's genre: ");
        genre = scan.nextLine();

        System.out.println("\nWhat's the studio name: ");
        studioName = scan.nextLine();

        System.out.println("\nWhat's the studio's location: ");
        location = scan.nextLine();

        //Instantiating
        Character character = new Character(characterName, characterType, hitPoints);
        VideoGame videoGame = new VideoGame(gameName, genre);
        GameStudio gameStudio = new GameStudio(studioName, location);

        //Copy
        Character character2 = new Character(character);
        VideoGame videoGame2 = new VideoGame(videoGame);
        GameStudio gameStudio2 = new GameStudio(gameStudio);

        //character.setCharacterName("Sadder");

        //Print sout
        System.out.println(character.printCharacter() + "\n" + videoGame.printVideoGame() + "\n" + gameStudio.printStudio() + "\n");
        //System.out.println(character2.printCharacter() + "\n" + videoGame2.printVideoGame() + "\n" + gameStudio2.printStudio() + "\n");
    }
}
