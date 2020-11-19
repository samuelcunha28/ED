public class Main {

    public static void main(String[] args) {
        UnorderedDoubleLinkedList<Integer> list = new UnorderedDoubleLinkedList<>();

        list.addToFront(1);
        list.addAfter(2, 1);
        list.addAfter(3, 2);
        list.addAfter(4, 3);
        list.addAfter(5, 4);

        System.out.print("From Head");
        System.out.println(list.toStringFromHead());
        System.out.print("From Tail");
        System.out.println(list.toStringFromTail());
    }
}
