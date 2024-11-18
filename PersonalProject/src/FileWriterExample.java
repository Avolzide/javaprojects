public class TeamMember{

    private String name;
    private int jerseyNumber;

    public TeamMember(){

        this.name = "Pikachu";
        this.jerseyNumber = 25;
    }

    public TeamMember(String name, int jerseyNumber) {

        this.name = name;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String toString(){

        return  "\nTeammate Name: " + getName() +
                "\nJersey Number: " + getJerseyNumber();
    }
}