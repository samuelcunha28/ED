import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws ElementNotFoundException, EmptyCollectionException {
        OrderedList<String> list = new OrderedList<>();
        list.add("D");
        list.add("B");
        list.add("A");
        list.add("C");
        list.add("E");

        list.remove("E");
        list.removeLast();
        list.removeFirst();


        Iterator it = list.iterator();

        while (it.hasNext()) {
            String obj = (String) it.next();
            System.out.println(obj);
        }

        // System.out.println(list.toString());
    }
}
