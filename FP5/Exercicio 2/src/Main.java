import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Interfaces.OrderedListADT;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws ElementNotFoundException, EmptyCollectionException {
        OrderedListADT<String> list = new DoubleLinkedOrderedList<>();

        list.add("E");
        list.add("X");
        list.add("A");
        list.add("B");

        list.remove("E");
        list.removeFirst();
        list.removeLast();

        Iterator it = list.iterator();

        while (it.hasNext()) {
            String obj = (String) it.next();
            System.out.println(obj);
        }

        //System.out.println(list.toString());
    }
}
