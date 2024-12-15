import java.util.ArrayList;
import java.util.List;
//Composite
class PodcastComposite extends Podcast implements ILibrary {
    private List<Podcast> podcastList = new ArrayList<Podcast>();

    public PodcastComposite() {
        super("Podcast Library", 0);
    }
        @Override
    public void showDetails() {
        for (Podcast pod: podcastList) {
            pod.showDetails();
        }
    }
    public void addPodcast(Podcast pod) {
        podcastList.add(pod);
        System.out.println(pod.title + " added to play list.");
    }
    public void removePodcast(Podcast pod) {
        podcastList.remove(pod);
    }
}