<<<<<<< HEAD:CLO3/src/TaganistCharacter.java
public class TaganistCharacter {
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

 4.3. Finally, output the information about the game studio, the published video game, and the main character in a clear and engaging format.*/


public class Character {
>>>>>>> 1ccd676773144453b565479e9cd5f2d95ab594a9:CLO3/src/Character.java

    private String characterName;
    private String characterType;
    private int hitPoints;

    //Parameterized constructor
    public TaganistCharacter(String cName, String cType, int hPoints){

        this.characterName = cName;
        this.characterType = cType;
        this.hitPoints = hPoints;
    }
    //Default constructor
<<<<<<< HEAD:CLO3/src/TaganistCharacter.java
    public TaganistCharacter(){
=======
    public Character(){
>>>>>>> 1ccd676773144453b565479e9cd5f2d95ab594a9:CLO3/src/Character.java
        this.characterName = " ";
        this.characterType = " ";
        this.hitPoints = 0;
    }
    //Copy constructor
    public TaganistCharacter(TaganistCharacter newCharacter){
        this.characterName = newCharacter.characterName;
        this.characterType = newCharacter.characterType;
        this.hitPoints = newCharacter.hitPoints;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public String printCharacter(){
        String str = "\nName: " + characterName + "\n" +
                     "Type: " + characterType + "\n" +
                     "Hit Points: " + hitPoints + "\n";
        return str;
    }
}