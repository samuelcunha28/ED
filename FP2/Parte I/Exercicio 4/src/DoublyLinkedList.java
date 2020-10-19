public class DoublyLinkedList<T> {

    private int count;
    private LinkedNode<T> head, tail;

    /**
     * Constructor
     */
    public DoublyLinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Método de lista vazia
     * @return
     */
    private boolean isEmpty() {
        return (this.count == 0);
    }


}
