<<<<<<< HEAD
public class GameStudio {
    private String studioName;
    private String location;
    private VideoGame publisherGame;
=======
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

 4.3. Finally, output the information about the game studio, the published video game, and the main character in a clear and engaging format.
 */

public class GameStudio {
    private String studioName;
    private String location;
    private VideoGame publishedGame;
>>>>>>> 1ccd676773144453b565479e9cd5f2d95ab594a9

    //Parameterized constructor
    public GameStudio(String studioName, String location){
        this.studioName = studioName;
        this.location = location;
    }
    //Default constructor
    public GameStudio(){
        this.studioName = " ";
        this.location = " ";
    }

    //Copy constructor
    public GameStudio(GameStudio copyGameStudio){
        this.studioName = copyGameStudio.studioName;
<<<<<<< HEAD
        this.location = copyGameStudio.studioName;
=======
        this.location = copyGameStudio.location;
>>>>>>> 1ccd676773144453b565479e9cd5f2d95ab594a9
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

<<<<<<< HEAD
=======
    public VideoGame getPublishedGame() {
        return publishedGame;
    }

    public void setPublishedGame(VideoGame publishedGame) {
        this.publishedGame = publishedGame;
    }

>>>>>>> 1ccd676773144453b565479e9cd5f2d95ab594a9
    public String printStudio(){
        String str = "\nStudio Name: " + studioName +
                     "\nLocation: " + location;
        return str;
    }
}
