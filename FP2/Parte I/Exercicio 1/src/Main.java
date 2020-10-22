import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;
public class Main {

    public static void main(String[] args) throws EmptyListException, ElementNotFoundException {
        Person p1 = new Person("Samuel");
        Person p2 = new Person("Joao");
        Person p3 = new Person("Ana");
        Person p4 = new Person("Ze");

        LinkedList<Person> lista = new LinkedList<>();

        System.out.println("");

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);
        System.out.println("Lista inicial: ");
        lista.printList();

        // Remover primeiro (correto)
        //lista.remove(p1);
        //lista.printList();

        // Remover do meio da lista (correto)
        //lista.remove(p2);
        //lista.remove(p3);
        //lista.printList();

        // Remove o ultimo da lista (correto)
        //lista.remove(p4);
        //lista.printList();

    }
}
