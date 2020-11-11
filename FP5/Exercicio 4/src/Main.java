import Exceptions.EmptyCollectionException;
import Interfaces.UnorderedArrayListADT;

public class Main {
    public static void main(String[] args) throws EmptyCollectionException {
        UnorderedArrayListADT<String> list = new UnorderedArrayList<>();

        list.addToFront("B");
        list.addToRear("C");
        list.addToFront("D");
        list.addAfter("A", "B");

        // list.removeFirst();
        // list.removeLast();
        System.out.println(list.toString());
    }
}
