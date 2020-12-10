import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) throws ElementNotFoundException, EmptyListException {
	    LinkedBinarySearchTree<Integer> tree = new LinkedBinarySearchTree<>();
	    Iterator<Integer> iterator;

		tree.addElement(3);
		tree.addElement(4);
		tree.addElement(7);
		tree.addElement(9);
		tree.addElement(2);
		tree.addElement(6);

	    // tree.removeElement(3);
		iterator = tree.iteratorInOrder();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("");
		System.out.println("Min expected (2), result is: " + tree.findMin());
		System.out.println("Max expected (9), result is: " + tree.findMax());
		/*
		// Teste às ocorrencias
		tree.addElement(3);
		tree.addElement(4);
		tree.addElement(2);
		tree.addElement(2);
		tree.addElement(2);
		tree.addElement(6);

		tree.removeAllOccurrences(2);
		System.out.println("Now all the occurrencies were removed");
		iterator = tree.iteratorInOrder();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		 */
    }
}
