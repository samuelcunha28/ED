import Exceptions.EmptyCollectionException;
import Interfaces.UnorderedDoubleLinkedListADT;

public class Main {

    public static void main(String[] args) throws EmptyCollectionException {
        UnorderedDoubleLinkedListADT<String> list = new UnorderedDoubleLinkedList<>();

        list.addToFront("D");
        list.addToFront("B");
        list.addToRear("A");
        list.addToFront("C");
        list.addAfter("E", "D");

        list.removeFirst();
        list.removeLast();
        System.out.println(list.toString());
    }
}
