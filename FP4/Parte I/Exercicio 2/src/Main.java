import Exceptions.EmptyCollectionException;

public class Main {

    public static void main(String[] args) throws EmptyCollectionException {
        CircularArrayQueue<String> list = new CircularArrayQueue<>();

        list.enqueue("A");
        list.enqueue("B");
        list.enqueue("C");
        list.enqueue("D");

        // System.out.println(list.toString());
        list.dequeue();
        list.dequeue();
        list.dequeue();
        list.dequeue();
        // System.out.println(list.toString());

        list.enqueue("F");
        list.enqueue("J");
        System.out.println(list.toString());
        System.out.println(list.size());
    }
}
