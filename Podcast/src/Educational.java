public class Educational extends Podcast implements ILibrary {

    private String subject;
    private String description;

    public Educational(String title, int minutes, String subject, String description) {
        super(title, minutes);
        this.subject = subject;
        this.description = description;
    }

    @Override
    public void showDetails() {
        System.out.println("Podcast Title: " + getTitle() + "\n" + "Length: " + getMinutes() + "\n" + "Subject: " + getSubject() + "\n" + "Description: " + getDescription() + "\n");
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
