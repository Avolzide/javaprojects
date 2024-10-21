public class VideoGame {
    private String gameName;
    private String genre;
    private TaganistCharacter mainCharacter;

    //Parameterized constructor
    public VideoGame(String gName, String gGenre){
        this.gameName = gName;
        this.genre = gGenre;
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

    public String printVideoGame(){
        String str = "\nGame Name: " + gameName + "\n" +
                     "Game Genre: " + genre + "\n";
        return str;
    }
}
