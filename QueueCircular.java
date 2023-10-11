public class QueueCircular<E> implements Queueable<E> {    
    private Node<E> last;

    public QueueCircular(){
        this.last = null;
    }
    // the last node points to the first node hint the circular queue

    @Override
    public boolean isEmpty() {
        return (this.last == null);
    }
    public boolean isSingleton() throws QueueException {
        if(this.isEmpty())
            return false;
        else{
            Node<E> first = this.last.getNext();// if it is not empty, make the first node = the last node.getNext(); creating the circle
            return (first == this.last);
        }
    }

    @Override
    public E peek() throws QueueException {
        if(this.isEmpty())
            throw new QueueException("Queue is empty");

        return this.last.getNext().getItem();
    }

    @Override
    public void enqueue(E item) {

        Node<E> node = new Node<E>(item);// creating a new node for the new item
        if(this.isEmpty()){
            this.last = node;
            this.last.setNext(node);
        }
        else{
            Node<E> first = this.last.getNext();// getting the first node by saying last.getNext();
            node.setNext(first);//setting the new node's next to the first
            last.setNext(node);//setting the new node to the new last
            this.last = node;//making new node this.last
        }
    }

    @Override
    public E dequeue() throws QueueException {
        if(isEmpty())
            throw new QueueException("Queue is empty");
        
        Node<E> first = this.last.getNext();
            if(this.isSingleton())
                this.last = null;
        else{
            Node<E> second = first.getNext();
            this.last.setNext(second);
        }
        return first.getItem();
    }

    @Override
    public void dequeueAll() {
        this.last = null;
    }

    @Override
    public String toString(){
        if(this.isEmpty())
            return "[]";
        else{
            String s = "[";
            Node<E> current = this.last.getNext();// first
            while(current != this.last){
                s = s + current.getItem();
                current = current.getNext();
            }
            s = s + this.last.getItem().toString();
            return s + "]";
        }
    }
    
}
