public abstract class Podcast implements ILibrary {
    protected String title = "";
    protected int minutes = 0;

    public Podcast(String title, int minutes){

        this.title = title;
        this.minutes = minutes;
    }

    @Override
    public void showDetails() {
    }

    public String toString(){
        return "!";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }
}
