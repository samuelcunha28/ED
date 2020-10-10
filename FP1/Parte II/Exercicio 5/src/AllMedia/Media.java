package AllMedia;

public class Media {

    private String name;

    public Media() {
    }

    public Media(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Media{" +
                "name='" + name + '\'' +
                '}';
    }
}
