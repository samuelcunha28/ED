public class SortingAndSearching {

    /**
     * Sorts the specified array of integers using the selection sort algorithm
     *
     * @param <T>
     * @param data the array to be sorted
     */
    public static <T extends Comparable<? super T>> void
    selectionSort(LinkedList<T> data) {

        LinearNode<T> current = data.getHead();
        LinearNode<T> temp;
        LinearNode<T> min;
        T tmpData;

        while (current != null) {
            min = current;
            temp = current.getNext();

            while (temp != null) {
                if (temp.getElement().compareTo(min.getElement()) < 0) {
                    min = temp;
                }
                temp = temp.getNext();
            }

            if (min != current) {
                tmpData = current.getElement();
                current.setElement(min.getElement());
                min.setElement(tmpData);
            }

            current = current.getNext();
        }
    }

    /**
     * Sorts the specified array of objects using an insertion
     * sort algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<? super T>> void
    insertionSort(LinkedList<T> data) {
        LinearNode<T> max = data.getHead().getNext();
        LinearNode<T> current;
        T tmp;

        while (max != null) {
            current = data.getHead();

            while (current != max) {

                if (max.getElement().compareTo(current.getElement()) < 0) {
                    tmp = current.getElement();
                    current.setElement(max.getElement());
                    max.setElement(tmp);
                }
                current = current.getNext();
            }
            max = max.getNext();
        }
    }

    /**
     * Sorts the specified array of objects using a bubble sort
     * algorithm.
     *
     * @param data the array to be sorted
     */
    public static <T extends Comparable<? super T>> void
    bubbleSort(LinkedList<T> data) {
        LinearNode<T> previous = data.getHead();
        LinearNode<T> current = previous.getNext();
        LinearNode<T> next = current.getNext();
        T tmp;


        while (current.getElement().compareTo(previous.getElement()) < 0 ||
                current.getElement().compareTo(next.getElement()) > 0) {

            previous = previous.getNext();
            current = previous.getNext();
            next = current.getNext();

            while (current != null) {
                next = current.getNext();
                if (next != null && previous.getElement().compareTo(next.getElement()) > 0) {
                    tmp = previous.getElement();
                    previous.setElement(next.getElement());
                    next.setElement(tmp);
                }

                if (previous.getElement().compareTo(current.getElement()) > 0) {
                    tmp = previous.getElement();
                    previous.setElement(current.getElement());
                    current.setElement(tmp);
                }

                previous = previous.getNext();
                current = previous.getNext();
            }
        }
    }

    /**
     * Sorts the specified array of objects using the quick sort
     * algorithm.
     *
     * @param data the array to be sorted
     * @param min  the integer representation of the minimum value
     * @param max  the integer representation of the maximum value
     */
    public static <T extends Comparable<? super T>> void
    quickSort(T[] data, int min, int max) {
    }

    /**
     * Used by the quick sort algorithm to find the partition.
     *
     * @param data the array to be sorted
     * @param min  the integer representation of the minimum value
     * @param max  the integer representation of the maximum value
     */
    private static <T extends Comparable<? super T>> int
    findPartition(T[] data, int min, int max) {
        return 0;
    }

    /**
     * Sorts the specified array of objects using the merge sort
     * algorithm.
     *
     * @param data the array to be sorted
     * @param min  the integer representation of the minimum value
     * @param max  the integer representation of the maximum value
     */
    public static <T extends Comparable<? super T>> void
    mergeSort(T[] data, int min, int max) {
    }
}

