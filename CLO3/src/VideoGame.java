public class VideoGame {
    private String gameName;
    private String genre;
    private Character mainCharacter;

    //Parameterized constructor
    public VideoGame(String gName, String gGenre, Character gCharacter){
        this.gameName = gName;
        this.genre = gGenre;
        this.mainCharacter = new Character(gCharacter);
    }
    //Default constructor
    public VideoGame(){
        this.gameName = "Generic";
        this.genre = "Unknown";
        this.mainCharacter = new Character();
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

    public Character getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(Character mainCharacter) {
        this.mainCharacter = mainCharacter;
    }
}
