import Exceptions.EmptyListException;

public class DoublyLinkedList<T> {

    private int count;
    private LinearNode<T> head, tail;

    public DoublyLinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    public int getCount() {
        return count;
    }

    private boolean isEmpty() {
        return (this.count == 0);
    }

    /**
     * Method to add at the head of the list
     *
     * @param element element to add
     */
    public void addHead(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);

        if (this.count == 0) {
            this.tail = newNode;
            this.head = newNode;
        } else {
            newNode.setNext(this.head);
            // The new node is going to be assigned to the head reference
            this.head.getNext().setPrevious(newNode);
            // The new node sets to first element
            this.head = newNode;
        }
        this.count++;
    }

    /**
     * Method to add an element to the list
     *
     * @param element
     */
    public void add(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            // node auxiliar com o valor de head
            LinearNode<T> current = this.head;

            // enquanto o elemento seguinte for diferente que null
            while (current.getNext() != null) {
                // inserir à frente ate chegar ao ponto onde o next do current seja null
                current = current.getNext();
            }
            // ligar o newNode à lista
            current.setNext(newNode);
            // liga o newNode à lista e tem a ligacao ao previous (setPrevious)
            current.getNext().setPrevious(newNode);
            // o ultimo vai ser o que entrou o newNode
            this.tail = newNode;
        }
        this.count++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            return;
        } else {
            this.head = this.head.getNext(); // remove o no da cabeça
            this.head.getNext().setPrevious(null); // liga a null
            this.count--;
        }
    }

    /**
     * Método que remove o primeiro elemento igual ao valor pretendido
     *
     * @param element
     */
    public void remove(T element) {
        if (isEmpty()) {
            return;
        } else {
            //current aponta para o seguinte
            LinearNode<T> current = this.head.getNext();
            //current aponta para o previous
            LinearNode<T> previous = this.head;

            while (current != null) {
                if (element.equals(current.getElement())) {
                    previous.setNext(current.getNext());
                    previous.getNext().setPrevious(previous.getPrevious());
                }

                previous = current;
                current = current.getNext();
            }
        }

        this.count--;
    }

    /**
     * Método que remove o elemento armazenado no ultimo nó da lista
     */
    public void removeLast() {
        if (isEmpty()) {
            return;
        } else {
            LinearNode<T> current = this.head;
            LinearNode<T> nodeAux = this.head;

            //enquanto o current.getNext for diferente de null
            while (current.getNext() != null) {
                //node auxiliar vai guardar a posição do current naquele momento
                nodeAux = current;
                //current vai ser igual a posição seguinte do current
                current = nodeAux.getNext();
            }

            //node auxiliar vai tomar o valor de null
            nodeAux.setNext(null);
            nodeAux.setPrevious(nodeAux.getPrevious());
            //o ultimo vai ser igual ao node auxiliar isto é null
            this.tail = nodeAux;
            this.count--;
        }
    }

    /**
     * Imprimir todos os elementos da list
     */
    public void printList() throws EmptyListException {
        LinearNode node = this.head;
        //só imprime se houver elementos na lista
        while (node != null) {
            System.out.print(node.toString() + "\n");
            node = node.getNext();
        }
    }

}
