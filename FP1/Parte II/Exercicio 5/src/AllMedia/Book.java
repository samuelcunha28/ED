package AllMedia;

public class Book extends Media {

    private String name;
    private String author;

    public Book(String name) {
        super(name);
    }

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
