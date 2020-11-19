import Exceptions.EmptyCollectionException;
import Interfaces.ListADT;

import java.util.Iterator;

public class DoubleLinkedList<T> implements ListADT<T> {
    protected DoubleNode<T> head, tail;
    protected int size = 0;
    protected int modCount = 0;

    /**
     * Default Constructor
     */
    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws EmptyCollectionException if the collection is empty
     */
    @Override
    public T removeFirst() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        } else if (size() == 1) {
            T element = (T) this.head;
            this.head = null;
            this.tail = null;
            size--;
            return element;
        } else {
            T element = (T) this.head;
            this.head = this.head.getNext();
            this.head.setPrevious(null);
            size--;
            return element;
        }

    }

    @Override
    public T removeLast() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        } else if (size() == 1) {
            T element = (T) this.tail;
            this.tail = null;
            this.head = this.tail;
            size--;
            return element;
        } else {
            T element = (T) this.tail;
            this.tail = tail.getPrevious();
            tail.setNext(null);
            size--;
            return element;
        }

    }

    @Override
    public T remove(T element) throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        }

        DoubleNode<T> tmpElement = search(element);

        if (tmpElement != null) {
            if (this.head == tmpElement || size() == 1) {
                return removeFirst();
            } else if (this.tail == tmpElement) {
                return removeLast();
            } else {
                tmpElement.getNext().setPrevious(tmpElement.getPrevious());
                tmpElement.getNext().getPrevious().setNext(tmpElement.getNext());

            }

            size--;
            return tmpElement.getElement();
        }

        return null;
    }


    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        }
        return head.getElement();
    }

    @Override
    public T last() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        }
        return tail.getElement();
    }

    @Override
    public boolean contains(T target) throws EmptyCollectionException {
        return (search(target) == target);
    }

    @Override
    public boolean isEmpty() {
        return (size() == 0);
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Iterator<T> iterator() {
        Iterator<T> itr = new DoublyLinkedListIterator<T>();
        return itr;
    }


    private DoubleNode<T> search(T target) throws EmptyCollectionException {

        DoubleNode<T> current = this.head;
        if (isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        }

        while (current != null) {

            if (current.getElement() == target) {
                return current;
            } else {
                current = current.getNext();
            }

        }

        return null;
    }

    @Override
    public String toString() {

        String text = "";
        Iterator<T> it = new DoublyLinkedListIterator<T>();


        if (isEmpty()) {
            return null;
        }

        while (it.hasNext()) {
            text += it.next().toString() + "\n";
        }

        return text;
    }

    /**
     * Class that represents an Iterator
     *
     * @param <T>
     */
    private class DoublyLinkedListIterator<T> implements Iterator<T> {
        private int expectedModCount = modCount;

        private DoubleNode<T> current = (DoubleNode<T>) head;

        @Override
        public boolean hasNext() {
            if (current != null) {
                return true;
            }

            return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T tmp = current.getElement();
                current = current.getNext();
                return tmp;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}