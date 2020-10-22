import Exceptions.EmptyListException;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) throws EmptyListException {
        Person p1 = new Person("Samuel");
        Person p2 = new Person("Joao");
        Person p3 = new Person("Ana");
        Person p4 = new Person("Ze");

        DoublyLinkedList<Person> lista = new DoublyLinkedList<>();

        System.out.println("");
        lista.addHead(p1);
        lista.add(p3);
        lista.add(p4);

        // lista.removeFirst();
        // lista.removeLast();
        // lista.remove(p3);

        lista.printList();

    }
}