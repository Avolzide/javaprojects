public class Story extends Podcast implements ILibrary{

    private String narrator;
    private String author;

    public Story(String title, int minutes, String narrator, String author) {
        super(title, minutes);
        this.narrator = narrator;
        this.author = author;
    }

    @Override
    public void showDetails() {
        System.out.println("Podcats Title: " + getTitle() + "\n" + "Length: " + getMinutes() + "\n" + "Narrator: " + getNarrator() + "\n" + "Author: " + getAuthor() + "\n");
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
