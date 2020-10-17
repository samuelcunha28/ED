import Exceptions.EmptyListException;

public class LinkedListSentinel<T> {

    private int count;
    private LinkedNode<T> head, tail;

    /**
     * Constructor for an empty list
     */
    public LinkedListSentinel() {
        this.head = new LinkedNode<>(null);
        this.tail = new LinkedNode<>(null);
    }

    /**
     * Getter for count
     *
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Getter for node head
     *
     * @return the node head
     */
    public LinkedNode<T> getHead() {
        return head;
    }

    /**
     * Getter for node tail
     *
     * @return the node tail
     */
    public LinkedNode<T> getTail() {
        return tail;
    }

    private boolean isEmpty() {
        return (this.count == 0);
    }

    /**
     * Method to add to the list
     * @param element
     */
    public void add(T element) {
        // new node
        LinkedNode<T> newNode = new LinkedNode<>(element);

        newNode.setNext(this.head.getNext());
        this.head.setNext(newNode);
        this.count++;
    }

    /**
     * Methos that removes the first element equal to the pretended value
     *
     * @param element element to remove
     */
    public boolean remove(T element) {
        boolean found = false;

        LinkedNode<T> previous = this.head;
        LinkedNode<T> current = this.head.getNext();

        while (current.getElement() != null ) {
            if (current.getElement().equals(element)) {
                previous.setNext(current.getNext());
                this.count--;
                return true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }

        return false;
    }

    /**
     * Imprimir todos os elementos da list
     */
    public void printList() throws EmptyListException {
        LinkedNode node = this.head;
        //só imprime se houver elementos na lista
        while (node != null) {
            System.out.print(node.toString() + "\n");
            node = node.getNext();
        }
    }
}
