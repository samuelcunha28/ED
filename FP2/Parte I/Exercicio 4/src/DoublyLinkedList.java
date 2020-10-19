import Exceptions.EmptyListException;

public class DoublyLinkedList<T> {

    private int count;
    private LinkedNode<T> head, tail;

    /**
     * Constructor of DoublyLinkedList
     */
    public DoublyLinkedList() {
        this.count = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Method that return a empty list
     *
     * @return
     */
    private boolean isEmpty() {
        return (this.count == 0);
    }

    /**
     * Method that adds a element into the head
     *
     * @param element the element to add
     */
    public void addHead(T element) {
        LinkedNode<T> newNode = new LinkedNode<>(element);
        if (isEmpty()) {
            this.head = this.tail = newNode;
        } else {
            newNode.setNext(this.head);
            //newNode vai ser atribuido a referencia do head
            this.head.getNext().setPrevious(newNode);
            //newNode passa a primeiro elemento
            this.head = newNode;
        }
        this.count++;
    }

    /**
     * Method that adds an element to the list
     *
     * @param element the element to add
     */
    public void add(T element) {
        //criação de um newNode node
        LinkedNode<T> newNode = new LinkedNode<>(element);

        if (isEmpty()) {
            this.head = newNode;
            this.tail = this.head;
        } else {
            //criamos um node auxiliar com o valor de head
            LinkedNode<T> current = this.head;

            //enquanto o elemento seguinte for diferente de null
            while (current.getNext() != null) {
                //inserir a frente até chegar onde o next do current seja null
                current = current.getNext();
            }

            //liga o newNode na lista
            current.setNext(newNode);
            //liga o newNode à lista tendo ligação ao previous(setPrevious)
            current.getNext().setPrevious(newNode);
            //o último elemento vai ser o que entrou o newNode
            this.tail = newNode;
        }
        this.count++;
    }

    /**
     * Method that removes the first node of the list
     */
    public void removeFirst() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Nao encontrado");
        } else {
            // remove o nó a cabeça
            this.head = this.head.getNext();
            // passam a ligar a null
            this.head.getNext().setPrevious(null);
            // reduz o numero de elementos
            this.count--;
        }
    }

    /**
     * Method that removes the last node of the list
     */
    public void removeLast() throws EmptyListException {
        if (isEmpty()) {
            throw new EmptyListException("Nao encontrado");
        } else {
            LinkedNode<T> current = this.head;
            LinkedNode<T> nodeAux = this.head;

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
     * Method that removes an element
     * @param value
     */
    public void remove(T value) {
        if (isEmpty()) {
            return;
        }else {
            //current aponta para o seguinte
            LinkedNode<T> current = this.head.getNext();
            //current aponta para o previous
            LinkedNode<T> previous = this.head;

            while (current != null) {
                if (value.equals(current.getElement())) {
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
     * Method to print the list
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
