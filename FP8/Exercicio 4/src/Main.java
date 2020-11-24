import Exceptions.EmptyListException;

public class Main {

    public static void main(String[] args) throws EmptyListException {

        Contact friend1 = new Contact("Clark", "Kent", "610-555-7384");
        Contact friend2 = new Contact("Bruce", "Wayne", "215-555-3827");
        Contact friend3 = new Contact("Peter", "Parker", "733-555-2969");
        Contact friend4 = new Contact("James", "Howlett", "663-555-3984");
        Contact friend5 = new Contact("Steven", "Rogers", "464-555-3489");
        Contact friend6 = new Contact("Britt", "Reid", "322-555-2284");
        Contact friend7 = new Contact("Matt", "Murdock", "243-555-2837");

        LinkedList<Contact> list = new LinkedList<>();

        list.add(friend1);
        list.add(friend2);
        list.add(friend3);
        list.add(friend4);
        list.add(friend5);
        list.add(friend6);
        list.add(friend7);

        // SortingAndSearching.selectionSort(list);
        // SortingAndSearching.insertionSort(list);
        // SortingAndSearching.bubbleSort(list);
        // SortingAndSearching.quickSort(list, 0, 6);
        // SortingAndSearching.mergeSort(list, 0, 6);

        list.printList();
    }
}
