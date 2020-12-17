import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Exceptions.EmptyListException;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws ElementNotFoundException, EmptyListException, EmptyCollectionException {
        ArrayHeap<Integer> heap = new ArrayHeap<>();
        Iterator<Integer> iterator;

        heap.addElement(3);
        heap.addElement(5);
        heap.addElement(4);
        heap.addElement(8);
        heap.addElement(7);
        heap.addElement(9);
        heap.addElement(2);

        //heap.removeMin();

        iterator = heap.iteratorLevelOrder();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
