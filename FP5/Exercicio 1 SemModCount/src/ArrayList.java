import Exceptions.ElementNotFoundException;
import Exceptions.EmptyCollectionException;
import Interfaces.ListADT;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayList<T> implements ListADT<T> {

    protected int rear;
    protected T[] array;
    protected int size;
    protected final int DEFAULT_SIZE = 5;
    private int counter = 0;

    /**
     * Constructor that defines a array with a default size
     */
    public ArrayList() {
        array = (T[]) (new Comparable[DEFAULT_SIZE]);
        this.size = 0;
        this.rear = 0;
    }

    /**
     * Constructor that defines a array with a given size
     *
     * @param tam the array size
     */
    public ArrayList(int tam) {
        array = (T[]) (new Comparable[tam]);
        this.size = 0;
        this.rear = 0;
    }

    /**
     * Method that adds more capacity to the array
     */
    public void expandCapacity() {
        array = Arrays.copyOf(array, array.length + DEFAULT_SIZE);
    }

    /**
     * Method thar finds an element in a array
     *
     * @param element element to find
     * @return the found element or null
     */
    public int find(T element) {
        for (int i = 0; i < this.rear; i++) {
            if (this.array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Removes and returns the first element from this list.
     *
     * @return the first element from this list
     * @throws EmptyCollectionException if the collection is empty
     */
    @Override
    public T removeFirst() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        }
        T removed = this.array[0];

        for (int i = 0; i < this.array.length - 1; i++) {
            this.array[i] = this.array[i + 1];
        }

        this.rear--;
        this.array[this.rear] = null;

        return removed;
    }

    /**
     * Removes and returns the last element from this list.
     *
     * @return the last element from this list
     * @throws EmptyCollectionException if the collection is empty
     */
    @Override
    public T removeLast() throws EmptyCollectionException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        }
        T removed = this.array[this.rear];
        this.array[this.rear] = null;
        this.rear--;

        return removed;
    }

    /**
     * Removes and returns the specified element from this list.
     *
     * @param element the element to be removed from the list
     * @return the element to remove
     * @throws EmptyCollectionException if the collection is empty
     * @throws ElementNotFoundException if the element is not found
     */
    @Override
    public T remove(T element) throws EmptyCollectionException, ElementNotFoundException {
        if (this.isEmpty()) {
            throw new EmptyCollectionException("Empty List");
        }

        if (!this.contains(element)) {
            throw new ElementNotFoundException("Element not found");
        }

        int position = this.find(element);
        T removed = this.array[this.find(element)];
        // this.contains(element);
        for (int i = position; i < this.rear - 1; i++) {
            this.array[i] = this.array[i + 1];
        }
        this.array[this.rear - 1] = null;
        this.rear--;

        return removed;
    }

    /**
     * Returns a reference to the first element in this list.
     *
     * @return a reference to the first element in this list
     */
    @Override
    public T first() {
        return this.array[0];
    }

    /**
     * Returns a reference to the last element in this list.
     *
     * @return a reference to the last element in this list
     */
    @Override
    public T last() {
        return this.array[this.rear - 1];
    }

    /**
     * Returns true if this list contains the specified target
     * element.
     *
     * @param target the target that is being sought in the list
     * @return true if the list contains this element
     */
    @Override
    public boolean contains(T target) {
        for (int i = 0; i < this.rear && this.array != null; i++) {
            if (this.array[i].equals(target)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Returns true if this list contains no elements.
     *
     * @return true if this list contains no elements
     */
    @Override
    public boolean isEmpty() {
        return this.rear == 0;
    }

    /**
     * Returns the number of elements in this list.
     *
     * @return the integer representation of number of
     * elements in this list
     */
    @Override
    public int size() {
        return this.rear;
    }

    @Override
    public Iterator<T> iterator() {
        return new MyIterator();
    }

    /**
     * Returns a string representation of this list.
     *
     * @return a string representation of this list
     */
    @Override
    public String toString() {
        String s = "";

        for (int i = 0; i < this.rear; i++) {
            s += this.array[i].toString() + " ";
        }

        return s;
    }

    /**
     * Class that represents an Iterator
     * @param <T>
     */
    public class MyIterator<T> implements Iterator<T> {
        // the position of the iterator
        private int pos = 0;

        /**
         * Default constructor
         */
        public MyIterator() {
        }

        /**
         * Method that verifies if there is an element next to the actual element
         * @return true if the element exists
         */
        @Override
        public boolean hasNext() {
            return this.pos != size();

            /*
            if (pos < size) {
                return true;
            }
            return false;
             */
        }

        /**
         * Method that moves the iterator to the next position
         * @return the last element where the iterator was
         */
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            return (T)array[this.pos++];

            /*
            if (hasNext()) {
                T tmp = (T) array[counter];
                counter++;
                return tmp;
            }
            throw new ArrayIndexOutOfBoundsException();
             */
        }
    }
}
