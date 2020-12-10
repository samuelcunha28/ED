import Interfaces.UnorderedListADT;

public class ArrayUnorderedList<T> extends ArrayList<T> implements UnorderedListADT<T> {

    /**
     * Adds a element to the front
     * @param element element to add
     */
    @Override
    public void addToFront(T element) {
        if (isEmpty()) {
            array[0] = element;
        }
        for (int i = rear - 1; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = element;

        modCount++;
        rear++;
    }

    /**
     * Adds a element to the rear
     * @param element element to add
     */
    @Override
    public void addToRear(T element) {
        array[rear] = element;
        rear++;
        modCount++;
    }

    /**
     * Adds a element after another
     * @param element element to add
     * @param target the target
     */
    @Override
    public void addAfter(T element, T target) {
        boolean found = false;
        int current = 0;

        while (current < size() && found == false) {
            if (array[current].equals(target)) {
                found = true;
            } else {
                current++;
            }
        }
        if (found = true) {
            for (int i = rear - 1; i > current; i--) {
                array[i + 1] = array[i];
            }
            array[current + 1] = element;
            rear++;
            modCount++;
        }
    }
}
