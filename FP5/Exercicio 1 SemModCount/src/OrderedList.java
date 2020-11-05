import Interfaces.OrderedListADT;

public class OrderedList<T extends Comparable> extends ArrayList<T> implements OrderedListADT<T> {

    public OrderedList() {
    }

    /**
     * Adds the specified element to this list at
     * the proper location
     *
     * @param element the element to be added to this list
     */
    @Override
    public void add(T element) {
        if (isEmpty()) {
            array[0] = element;
        } else if (size() == array.length) {
            expandCapacity();
        } else {
            boolean found = false;
            int current = 0;

            while (current < size && found == false) {
                Comparable<T> tmp = (Comparable<T>) array[current];
                if (tmp.compareTo(element) > 0) {
                    found = true;
                } else {
                    current++;
                }
            }

            if(found = true){
                for (int i = rear - 1; i >= current; i--) {
                    array[i + 1] = array[i];
                }
                array[current] = element;
            } else {
                array[rear] = element;
            }
        }
        rear++;
        size++;
    }
}