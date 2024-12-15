public class Interview extends Podcast implements ILibrary{

    private String guest;
    private String host;

    public Interview(String title, int minutes, String guest, String host) {
        super(title, minutes);
        this.guest = guest;
        this.host = host;
    }

    @Override
    public void showDetails() {
        System.out.println("Podcast Title: " + getTitle() + "\n" + "Length: " + getMinutes() + "\n" + "Host: " + getHost() + "\n" + "Guest: " + getGuest() + "\n");
    }

    public String getGuest() {
        return guest;
    }

    public void setGuest(String guest) {
        this.guest = guest;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
