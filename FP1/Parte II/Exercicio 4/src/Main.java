import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("My");
        list.add("Name");
        list.add("is");
        list.add("Samuel");

        Collections.sort(list, new Comparator<String>() {

                    @Override
                    public int compare(String o1, String o2
                    ) {
                        if (o1.length() > o2.length()) {
                            return 1;
                        } else if (o1.length() < o2.length()) {
                            return -1;
                        } else {
                            return 0;
                        }
                    }

                }
        );
        System.out.println(list);
    }
}

