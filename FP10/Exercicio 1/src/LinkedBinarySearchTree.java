import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;
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
     *                search tree
     */
    public LinkedBinarySearchTree(T element) {
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

    /**
     * Removes the first element that matches the specified target
     * element from the binary search tree and returns a reference to it
     * Throws a ElementNotFoundException if the specified target
     * element is not found in the binary search tree
     *
     * @param targetElement the element being sought in the binary search tree
     * @throws ElementNotFoundException if an element nof found exception occurs
     */
    @Override
    public T removeElement(T targetElement) throws ElementNotFoundException, EmptyListException {
        T result = null;
        if (!isEmpty()) {

            if (((Comparable) targetElement).equals(root.element)) {
                result = root.element;
                root = replacement(root);
                count--;
            } else {
                BinaryTreeNode<T> current, parent = root;
                boolean found = false;

                if (((Comparable) targetElement).compareTo(root.element) < 0) {
                    current = root.left;
                } else {
                    current = root.right;
                }

                while (current != null && !found) {

                    if (targetElement.equals(current.element)) {

                        found = true;
                        count--;
                        result = current.element;

                        if (current == parent.left) {
                            parent.left = replacement(current);
                        } else {
                            parent.right = replacement(current);
                        }
                    } else {
                        parent = current;

                        if (((Comparable) targetElement).compareTo(current.element) < 0) {
                            current = current.left;
                        } else {
                            current = current.right;
                        }
                    }
                } //while

                if (!found) {
                    throw new ElementNotFoundException("Not found in binary search tree");
                }
            }
        } else {// end outer if
            throw new EmptyListException("list is empty");
        }
        return result;
    }

    /**
     * Returns a reference to a node that will replace the one specified
     * for removal. In the case where the removed node has two children,
     * the inorder successor is used as its replacement
     *
     * @param node the node to be removed
     * @return a reference to the replacing node
     */
    protected BinaryTreeNode<T> replacement(BinaryTreeNode<T> node) {
        BinaryTreeNode<T> result = null;

        // Se o node é uma folha
        if ((node.left == null) && (node.right == null)) {
            result = null;
            // Se o node só tem um filho à direita, o node é substituido pelo seu filho
        } else if ((node.left != null) && (node.right == null)) {
            result = node.left;
            // Se o node só tem um filho à direita, o node é substituido pelo seu filho
        } else if ((node.left == null) && (node.right != null)) {
            result = node.right;
        } else {
            BinaryTreeNode<T> current = node.right;
            BinaryTreeNode<T> parent = node;
            // Chegar ao final do filho direito do lado esquerdo
            while (current.left != null) {
                parent = current;
                current = current.left;
                // se o node sem filho à esquerda for igual ao filho direito do node a remover, o filho esquerdo passa a ser filho esquerdo do filho direito
            }
            if (node.right == current) {
                current.left = node.left;
                // se o node filho da direita tiver nodes à esquerda, este node substituirá o node removido e o node pai dele passará a ser seu filho á direita
            } else {
                parent.left = current.right;
                current.right = node.left;
                current.left = node.left;
            }
            result = current;
        }
        return result;
    }

    /**
     * Removes all occurrences of the specified element from this tree
     *
     * @param targetElement the element that the list will have all
     *                      instances of it removed
     */
    @Override
    public void removeAllOccurrences(T targetElement) throws ElementNotFoundException, EmptyListException {
        removeElement(targetElement);

        try {
            while (true) {
                removeElement(targetElement);
            }
        } catch (Exception e) {

        }
    }

    /**
     * Removes and returns the smallest element from this tree
     *
     * @return the smallest element from this tree
     */
    @Override
    public T removeMin() throws EmptyListException, ElementNotFoundException {
        return removeElement(findMin());
    }

    /**
     * Removes and returns the largest element from this tree
     *
     * @return the largest element from this tree
     */
    @Override
    public T removeMax() throws EmptyListException, ElementNotFoundException {
        return removeElement(findMax());
    }

    /**
     * Returns a reference to the smallest element in this tree
     *
     * @return a reference to the smallest element in this tree
     */
    @Override
    public T findMin() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Empty list");
        }

        BinaryTreeNode<T> current = root;

        while (current.left != null) {
            current = current.left;
        }
        
        return current.element;
    }

    /**
     * Returns a reference to the largest element in this tree
     *
     * @return a reference to the largest element in this tree
     */
    @Override
    public T findMax() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Empty list");
        }

        BinaryTreeNode<T> current = root;

        while (current.right != null) {
            current = current.right;
        }

        return current.element;
    }
}
