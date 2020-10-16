import Exceptions.ElementNotFoundException;
import Exceptions.EmptyListException;

public class LinkedList<T> {

    private int count;
    private LinkedNode<T> head, tail;

    /**
     * Constructor of LinkedList
     */
    public LinkedList() {
        this.count = 0;
        this.head = this.tail = null;
    }

    /**
     * Getter for count
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * Getter for node head
     * @return the node head
     */
    public LinkedNode<T> getHead() {
        return head;
    }

    /**
     * Getter for node tail
     * @return the node tail
     */
    public LinkedNode<T> getTail() {
        return tail;
    }

    /**
     * Metodo para adicionar um elemento ao node
     * @param element
     */
    public void add(T element) {
        LinkedNode<T> newElement = new LinkedNode<>(element);

        /**
         * Percorre este if quando a lista está vazia. Tem que se apontar o head e o tail ao novo elemento.
         * Se caso fosse usado o setNext, o novo elemento estaria a apontar para um node nulo, o que é obviamente impossivel
         */
        if (this.head == null) {
            this.head = newElement;
            this.tail = newElement;
            // this.head = this.tail = element
        } else {
            /**
             * Se a lista tiver elementos entra no else. O novo elemento tem que ligar ao elemento anteriormente ligado ao head
             * e o head ao novo elemento a adicionar.
             */
            newElement.setNext(this.head);
            this.head = newElement;
        }
        count++;
    }

    private boolean isEmpty() {
        return (this.count == 0);
    }

    public void remove(T element) throws EmptyListException, ElementNotFoundException {
        // Caso a lista esteja vazia
        if (count == 0) {
            throw new EmptyListException("A lista esta vazia");
        } else {
            LinkedNode current = this.head;
            LinkedNode previous = null;
            boolean found = false;

            while(current != null && found == false) {
                if(current.getElement() == element) {
                    found = true;
                } else {
                    previous = current;
                    current = current.getNext();
                }
            }
            // Remove-se caso o nodo seja encontrado
            if (found == true) {
                // Remove o primeiro node com ou sem elemento
                if(this.head.getElement().equals(element)|| this.head.getElement().equals(null)) {
                    this.head.setNext(current.getNext());
                    this.head = current.getNext();

                    // Caso o primeiro node seja o unico elemento da lista
                    if (current.equals(tail)) {
                        this.tail = null;
                        this.head = null;
                    }
                    // Remove um node do meio da lista com ou sem elemento
                } else if (current != this.tail && current.getElement().equals(element) || current.getElement().equals(null)) {
                    previous.setNext(current.getNext());
                    // Remove o ultimo node com ou sem elemento
                } else if (this.tail.getElement().equals(element) || this.tail.getElement().equals(null)) {
                    previous.setNext(tail.getNext());
                    this.tail = previous;
                }
                count--; // Depois de removido decrementa-se o contador
                // return found;
            } else {
                throw new ElementNotFoundException("O node nao foi encontrado");
            }
        }
    }
    /**
     * Imprimir todos os elementos da list
     */
    public void printList() throws EmptyListException {
        LinkedNode node = this.head;
        //só imprime se houver elementos na lista
        while (node != null) {
            System.out.print(node.toString() + "\n");
            node = node.getNext();
        }
    }
}