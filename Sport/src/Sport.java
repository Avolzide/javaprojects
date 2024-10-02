/*
David Cortinez
09/19/2024
COSC-1437-001
* Purpose: To encapsulate the concept of sport team using getters and setters, constructors, classes,
* user interaction and math */
/*
---Outline------------------------------------------------------------------------------
* Create a Sport class
* List out private variables from lab instructions
* Use Getter and setters for each variable
* Make a getter only for the win loss ratio
* Create a driver main file with the java scanner class for user i/o
 ---------------------------------------------------------------------------------------*/

public class Sport {

    //Private variables to use
    private String name;
    private int seasonWins;
    private int seasonLosses;
    private int numberOfPlayers;

    //Parameterized Constructor
    public Sport(String teamName, int wins, int losses, int numPlayers) {
        this.name = teamName;
        this.seasonWins = wins;
        this.seasonLosses = losses;
        this.numberOfPlayers = numPlayers;
    }

    //Default Constructor
    public Sport() {
        this.name = "Wazoo";
        this.seasonWins = 1;
        this.seasonLosses = 1;
        this.numberOfPlayers = 0;
    }

    //Getter and setters here
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSeasonWins() {
        return seasonWins;
    }
    public void setSeasonWins(int seasonWins) {
        this.seasonWins = seasonWins;
    }
    public int getSeasonLosses() {
        return seasonLosses;
    }
    public void setSeasonLosses(int seasonLosses) {
        this.seasonLosses = seasonLosses;
    }
    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
    public void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }

    //No corresponding setter method for the win loss ratio
    public double getWinLossRatio() {
        int totalGames = seasonWins + seasonLosses;
        return (double) seasonWins / totalGames * 100;
    }
}
