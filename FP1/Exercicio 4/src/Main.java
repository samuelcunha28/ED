import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<?> c = new ArrayList<String>();
        printCollection(c);
    }

    static void printCollection(Collection<Object> c) {
        for (Object e : c) {
            System.out.println(e);
        }
    }
}
// Object e um tipo superior
