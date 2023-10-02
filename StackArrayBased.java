public class StackArrayBased<E> implements Stackable<E> {

    //array to hold the elements of the stack
    private Object[] items;// how many items -- used Object bc java does not allow arrays of E(generic) types, but E inherits from Object class.
    private int top;// index of the top
    private static final int MAX = 50; // arbitray choice

    public StackArrayBased(){
        this.items = new Object[MAX];// had to use Object, java does not allow arrays of E.
        this.top = -1; // not a valid index -- tells us the stack is empty
    }


    @Override
    public boolean isEmpty() {
        return (this.top == -1);// this.top < 0
    }
    
    public boolean isFull(){
        return (this.top == MAX -1);
    }

    @Override
    public void popAll() {
        this.top = -1;
        this.items = new Object[MAX];
    }


    @Override
    public void push(E newItem) throws StackException{
        if(this.isFull())
            throw new StackException("Stack is at maximum capacity");

        this.top++;
        this.items[top] = newItem;
    }

    @Override
    public E pop() throws StackException {
        if(this.isEmpty())
            throw new StackException("Stack is currently empty");

        // have to do
        E item = (E)this.items[this.top];

         // optional free up memory
        this.items[this.top] = null;

        // have to do
        this.top--;
       
        return item;
        
    }

    @Override
    public E peek() throws StackException {
        if(this.isEmpty())
            throw new StackException("Stack is currently empty");
        
            return (E)this.items[this.top];

    }

    @Override
    public String toString(){
        String s = "[";
        for (int i = top; i >= 0; i--){
            s = s + this.items[i].toString();
            if(i != 0)
                s = s + ", ";
        }

        s = s + "]";
        return s;
    }
    
}
