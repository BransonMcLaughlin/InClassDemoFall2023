public class TestQueue {
    public static void main(String[] args) {
        QueueFirstLast<Integer> queue = new QueueFirstLast<Integer>();
        System.out.println("Test isEmpty: " + queue.isEmpty());
        System.out.println();

        System.out.println("Test Enqueue: ");
        for(int i = 0; i < 10; i++)
            queue.enqueue(i);
        System.out.println(queue.toString());
        System.out.println();

        System.out.println("Test Dequeue: ");
        for(int i = 0; i < 5; i++)
            System.out.println(queue.dequeue());
        System.out.println(queue.toString());
        System.out.println();

        System.out.println("Test Dequeue All");
        queue.dequeueAll();
        System.out.println(queue.toString());
        System.out.println();
    }
}
