public class GameStudio {
    private String studioName;
    private String location;
    private VideoGame publisherGame;

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
        this.location = copyGameStudio.studioName;
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

    public String printStudio(){
        String str = "\nStudio Name: " + studioName +
                     "\nLocation: " + location;
        return str;
    }
}
