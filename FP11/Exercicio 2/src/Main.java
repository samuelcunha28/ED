import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws EmptyCollectionException {
	    PriorityQueue<Integer> queue = new PriorityQueue<>();
        Iterator<Integer> iterator;

        queue.addElement(15, 2);
        queue.addElement(10, 1);
        queue.addElement(30, 3);

        System.out.println("Removed: " + queue.removeNext());

        Iterator it = queue.iteratorLevelOrder();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }
}
