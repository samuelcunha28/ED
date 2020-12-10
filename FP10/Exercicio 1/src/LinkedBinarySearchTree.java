import Interfaces.BinarySearchTreeADT;

public class LinkedBinarySearchTree<T> extends LinkedBinaryTree<T>
                                    implements BinarySearchTreeADT<T> {

    /**
     * Creates an empty binary search tree
     */
    public LinkedBinarySearchTree() {
        super();
    }

    /**
     * Creates a binary search with the specified element as its root
     *
     * @param element the element that will be the root of the new binary
     * search tree
     */
    public LinkedBinarySearchTree (T element) {
        super(element);
    }

    /**
     * Adds the specified object to the binary search tree in the
     * appropriate position according to its key value. Note that
     * equal elements are added to the right
     *
     * @param element the element to be added to this tree
     */
    @Override
    public void addElement(T element) {
        BinaryTreeNode<T> temp = new BinaryTreeNode<>(element);
        Comparable<T> comparableElement = (Comparable<T>) element;

        if (isEmpty()) {
            root = temp;
        } else {
            BinaryTreeNode<T> current = root;
            boolean added = false;
            while (!added) {
                if (comparableElement.compareTo(current.element) < 0) {
                    if (current.left == null) {
                        current.left = temp;
                        added = true;
                    } else {
                        current = current.left;
                    }
                } else {
                    if (current.right == null) {
                        current.right = temp;
                        added = true;
                    } else {
                        current = current.right;
                    }
                }
            }
            count++;
        }

    }

    @Override
    public T removeElement(T targetElement) {
        return null;
    }

    @Override
    public void removeAllOccurrences(T targetElement) {

    }

    @Override
    public T removeMin() {
        return null;
    }

    @Override
    public T removeMax() {
        return null;
    }

    @Override
    public T findMin() {
        return null;
    }

    @Override
    public T findMax() {
        return null;
    }
}
