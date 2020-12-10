/**
 * BinaryTreeNode represents a node in a binary tree with
 * a left and right child
 */
public class BinaryTreeNode<T> {
    protected T element;
    protected BinaryTreeNode<T> left, right;

    /**
     * Creates a new tree node with the specified data
     * @param obj the element that will become a part of the new tree node
     */
    BinaryTreeNode(T obj) {
        element = obj;
        left = null;
        right = null;
    }

    public int numChildren() {
        int children = 0;

        if (left != null) {
            children = 1 + left.numChildren();
        }

        if (right != null) {
            children = children + 1 + right.numChildren();
        }

        return children;
    }
}
