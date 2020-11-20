public class LinearSearch {
    /**
     * Searches the specified array of objects using a linear search algotithm
     *
     * @param <T>
     * @param data   the array to be sorted
     * @param target the element being searched for
     * @return true if the desired element is found
     */
    public static <T extends Comparable<? super T>> boolean
    linearSearch(LinkedList<T> data, T target) {

        LinearNode<T> current = data.getHead();

        while (current != null) {
            if (current.getElement().compareTo(target) == 0) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }
}
