import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        Integer[] a = {1, 2, 7, 4, null, 5, 6};
        ArrayBinaryTree<Integer[]> tree = new ArrayBinaryTree<>(a);

        Iterator c = tree.iteratorInOrder();

        /*
        Iterator c = tree.iteratorPreOrder();
        Iterator c = tree.iteratorPostOrder();
        Iterator c = tree.iteratorLevelOrder();
        */

        while (c.hasNext()) {
            System.out.print(c.next() + " ");
        }
    }
}