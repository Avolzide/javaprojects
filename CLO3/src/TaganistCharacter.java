public class TaganistCharacter {

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
    public TaganistCharacter(){
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