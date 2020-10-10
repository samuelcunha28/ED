import AllMedia.Music;
import AllMedia.Video;
import MediaManagement.Management;

public class Main {

    public static void main(String[] args) {

        Music m1 = new Music("Track1", "John Lennon");
        Music m2 = new Music("Track2", "Michael Jackson");

        Video v1 = new Video("Rambo", "IDK");
        Video v2 = new Video("Avatar", "IDK");

        Management<Music> musicManagement = new Management<>();
        musicManagement.addToList(m1);
        musicManagement.addToList(m2);
        musicManagement.getFromList(0);
        musicManagement.getAllList();

        Management<Video> videoManagement = new Management<>();
        videoManagement.addToList(v1);
        videoManagement.addToList(v2);
        videoManagement.getFromList(1);
        videoManagement.getAllList();
    }
}
