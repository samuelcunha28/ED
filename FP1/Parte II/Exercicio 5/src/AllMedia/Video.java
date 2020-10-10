package AllMedia;

public class Video extends Media {

    private String name;
    private String author;

    public Video(String name) {
        super(name);
    }

    public Video(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
