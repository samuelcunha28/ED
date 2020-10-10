package AllMedia;

public class Music extends Media {

    private String name;
    private String author;

    public Music(String name) {
        super(name);
    }

    public Music(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
