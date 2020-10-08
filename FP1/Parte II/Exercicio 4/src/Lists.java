import java.util.ArrayList;
import java.util.List;

public class Lists<T> {
    private List<T> c = new ArrayList<T>();

    public Lists() {
    }

    public void addToList(T e) {
        c.add(e);
    }

    public void printList() {
        System.out.println("My list: " + c);
    }

    public void sortList() {
        Compare compare = new Compare();
    }
}
