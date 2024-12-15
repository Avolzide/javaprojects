public class Driver {

    public static void main(String[] args) {

        PodcastComposite podcastComposite = new PodcastComposite();

        Podcast educational = new Educational("Java Objects", 45, "Java Programming", "Overview of OOP in Java");
        Podcast interview = new Interview("Interview with the Mayor", 20,"Juan Valdez", "Homer Simpson");
        Podcast story = new Story("Animal Farm", 120, "Bart Simpson", "George Owwell");

        System.out.println("----------------------------------------------");
        System.out.println("Adding Podcasts to my Play List: ");
        System.out.println("----------------------------------------------");

        podcastComposite.addPodcast(educational);
        podcastComposite.addPodcast(interview);
        podcastComposite.addPodcast(story);
        System.out.println();

        System.out.println("----------------------------------------------");
        System.out.println("Showing my entire playlist");
        System.out.println("----------------------------------------------");

        podcastComposite.showDetails();
    }
}
