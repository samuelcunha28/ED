package Interfaces;

import Exceptions.EmptyCollectionException;

public interface HeapADT<T> extends BinaryTreeADT<T> {

    /**
     * Adds the specified object to this heap
     *
     * @param obj the element to be added to this heap
     */
    public void addElement (T obj);

    /**
     * Removes the element with the lowest value in
     * this heap
     *
     * @return the element with the lowest value from this heap
     */
    public T removeMin() throws EmptyCollectionException;

    /**
     * Returns a reference to the element with the lowest value in
     * this heap
     *
     * @return a reference to the element with the lowest value in this
     * heap
     */
    public T findMin();
}
