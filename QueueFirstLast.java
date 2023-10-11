public class QueueFirstLast<E> implements Queueable<E> {

    private Node<E> first;
    private Node<E> last;

    public QueueFirstLast(){
        this.first = null;
        this.last = null;
    }
    @Override
    public boolean isEmpty() {
        return (this.first == null);
    }

     @Override
    public void dequeueAll() {
        this.first = null;
        this.last = null;
    }

    @Override
    public E peek() throws QueueException {
        if(this.isEmpty())
            throw new QueueException("The Queue is empty");
        
        E item = this.first.getItem();// creating an item variable and setting it equal to the first node's item
        return item;
    }

    @Override
    public void enqueue(E item) {
        // first this is first you have to create a node for the newItem
        // next you need to make the previous last point to the new node
        // finally make the new node point to null
        Node<E> node = new Node<E>(item);// made the node

        if(this.isEmpty())// if empty it would be the first and last node
           this.first = node;
        else
           this.last.setNext(node);// making current last node point to new node
        
        this.last = node;// setting new node as the last node

    }

    @Override
    public E dequeue() throws QueueException {
        if(this.isEmpty())
            throw new QueueException("The Queue is emtpy");
        
        E returnValue = this.first.getItem();// could set equal to this.peek()

        Node<E> secondNode = this.first.getNext();
        this.first = secondNode;//could do these two is the same line this.first = this.first.getNext();

        return returnValue;
    }

    @Override
    public String toString(){
        String s = "[";
        Node<E> current = this.first;
        while(current != null){
            s = s + current.getItem();
            current = current.getNext();

            if(current != null)
                s = s + ", ";
        }
        return s + "]";
    }

   
    
}
