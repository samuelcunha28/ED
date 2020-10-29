import Exceptions.EmptyCollectionException;

public class Main {

    public static void main(String[] args) throws EmptyCollectionException {
	    LinkedQueue<String> list = new LinkedQueue<>();

	    list.enqueue("A");
        list.enqueue("B");
        list.enqueue("C");
        list.enqueue("D");
        // System.out.println(list.toString());
        list.dequeue();
        // System.out.println(list.toString());
        System.out.println(list.first());
        System.out.println(list.size());

    }
}
