import Exceptions.EmptyCollectionException;

public class Main {

    public static void main(String[] args) throws EmptyCollectionException {
        LinkedStack<Integer> stack = new LinkedStack<>();

        stack.push(1);
        // System.out.println(stack.toString());

        stack.push(2);
        // System.out.println(stack.toString());

        stack.push(3);
        // System.out.println(stack.toString());

        // stack.pop();
        // System.out.println(stack.toString());
        // System.out.println(stack.peek());
        // System.out.println(stack.toString());
    }
}
