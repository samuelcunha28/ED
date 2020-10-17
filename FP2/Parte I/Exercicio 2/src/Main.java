import Exceptions.EmptyListException;

public class Main {

    public static void main(String[] args) throws EmptyListException {
        Person p1 = new Person("Samuel");
        Person p2 = new Person("Joao");
        Person p3 = new Person("Ana");

        LinkedListSentinel<Person> lista = new LinkedListSentinel<>();

        System.out.println("");
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        // lista.printList();

        // lista.remove(p2);
        // lista.printList();
    }
}
