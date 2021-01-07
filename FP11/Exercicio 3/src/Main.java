import Exceptions.EmptyCollectionException;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws EmptyCollectionException {
	    LinkedHeap<Integer> heap = new LinkedHeap<>();
        Iterator<Integer> iterator;

        heap.addElement(3);
        heap.addElement(4);
        heap.addElement(6);
        heap.addElement(1);
        heap.addElement(2);

        System.out.println("Remove min (1). Expected: " + heap.removeMin());

        iterator = heap.iteratorLevelOrder();
        while (iterator.hasNext())  {
            System.out.println(iterator.next());
        }
    }
}
