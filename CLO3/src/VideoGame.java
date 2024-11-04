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


public class VideoGame {
    private String gameName;
    private String genre;
    private TaganistCharacter mainCharacter;

    //Parameterized constructor
<<<<<<< HEAD
    public VideoGame(String gName, String gGenre){
        this.gameName = gName;
        this.genre = gGenre;
=======
    public VideoGame(String name, String genre){
        this.gameName = name;
        this.genre = genre;
>>>>>>> 1ccd676773144453b565479e9cd5f2d95ab594a9
    }
    //Default constructor
    public VideoGame(){
        this.gameName = "Generic";
        this.genre = "Unknown";
    }
    //Copy constructor
    public VideoGame(VideoGame copyVGame){
        this.gameName = copyVGame.gameName;
        this.genre = copyVGame.genre;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

<<<<<<< HEAD
=======
    //Printout
>>>>>>> 1ccd676773144453b565479e9cd5f2d95ab594a9
    public String printVideoGame(){
        String str = "\nGame Name: " + gameName + "\n" +
                     "Game Genre: " + genre + "\n";
        return str;
    }
}
