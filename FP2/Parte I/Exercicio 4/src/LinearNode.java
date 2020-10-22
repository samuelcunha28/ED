public class LinearNode<T> {

    private T element;
    private LinearNode<T> next, previous;

    /**
     * Constructor
     */
    public LinearNode() {
    }

    /**
     * Constructor
     * @param element element node
     */
    public LinearNode(T element) {
        this.next = null;
        this.previous = null;
        this.element = element;
    }

    /**
     * Getter for the next node
     * @return next node
     */
    public LinearNode<T> getNext() {
        return this.next;
    }

    /**
     * Setter for the next node
     * @param next next node
     */
    public void setNext(LinearNode<T> next) {
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

    public LinearNode<T> getPrevious() {
        return previous;
    }

    public void setPrevious(LinearNode<T> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "LinkedNode{" +
                "element=" + element +
                '}';
    }
}
