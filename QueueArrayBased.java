public class QueueArrayBased<E> implements Queueable<E> {
    private static final int MAX = 50;// all the queue's have the same max amount of items
    private int size;// all the array based queue's can have different sizes or items in them
    private Object[] queueArray;

    public QueueArrayBased(){
        this.size = 0;
        this.queueArray = new Object[MAX];
    }

    @Override
    public boolean isEmpty() {
       return (this.size == 0);
    }

    
    public boolean isFull(){
        return (this.size == MAX);
    }

    @Override
    public E peek() throws QueueException {
        if(this.isEmpty())
            throw new QueueException("Queue is Empty!");

        return (E)this.queueArray[0];
    }

    @Override
    public void enqueue(E item) throws QueueException {
        if (this.isFull())
            throw new QueueException("Queue is full!");

        this.queueArray[this.size] = item;   
        this.size++; 
    }

    @Override
    public E dequeue() throws QueueException {
       if(this.isEmpty())
            throw new QueueException("Queue is empty");

        E firstItem = (E)this.queueArray[0];
        for(int i = 1; i < this.size; i++){
            this.queueArray[i-1] = this.queueArray[i];
        }
        this.queueArray[this.size-1] = null;// optional to erase the old last item from memory
        this.size--;

        return firstItem;
    }

    @Override
    public void dequeueAll() {
        this.size = 0;

        this.queueArray = new Object[MAX];// optional but recommended
    }

    @Override
    public String toString(){
        String s = "["; 
        for(int i = 0; i < this.size; i++){
            s = s + this.queueArray[i].toString();
                if(i != this.size-1)
                    s = s + ", ";
        }
        return "";
    }
    
}
