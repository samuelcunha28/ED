import Exceptions.EmptyListException;

public class Main {

    public static void main(String[] args) throws EmptyListException {
        Car car1 = new Car("Audi", 2019);
        Car car2 = new Car("BMW", 1997);
        Car car3 = new Car("Mercedes", 2018);
        Car car4 = new Car("Opel", 2020);

        LinkedList<Car> list = new LinkedList<>();

        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);

        // list.printList();

        System.out.println("Resultado da pesquisa linear: " + LinearSearch.linearSearch(list, car1));
        // System.out.println("Resultado da pesquisa binaria: " + BinarySearch.binarySearch(list, car4));

    }
}
