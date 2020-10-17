public class LinkedNode<T> {

    private T element;
    private LinkedNode<T> next;

    /**
     * Constructor
     */
    public LinkedNode() {
    }

    /**
     * Constructor
     * @param element element node
     */
    public LinkedNode(T element) {
        this.next = null;
        this.element = element;
    }

    /**
     * Getter for the next node
     * @return next node
     */
    public LinkedNode<T> getNext() {
        return this.next;
    }

    /**
     * Setter for the next node
     * @param next next node
     */
    public void setNext(LinkedNode<T> next) {
        this.next = next;
    }

    /**
     * Getter for the element
     * @return the element
     */
    public T getElement() {
        return this.element;
    }

    /**
     * Setter for the element
     * @param element the element
     */
    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "element=" + element +
                '}';
    }
}
