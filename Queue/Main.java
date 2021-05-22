package Queue;

public class Main {
    public static void main(String[] args) {
        MyQueue.Queue queue = new MyQueue.Queue();
        queue.front = queue.rear = null;

        MyQueue.enQueue(queue, 14);
        MyQueue.enQueue(queue, 22);
        MyQueue.enQueue(queue, 6);

        MyQueue.displayQueue(queue);

        System.out.print("\nDeleted value = " + MyQueue.deQueue(queue));
        System.out.print("\nDeleted value = " + MyQueue.deQueue(queue)+"\n");

        MyQueue.displayQueue(queue);

        MyQueue.enQueue(queue, 9);
        MyQueue.enQueue(queue, 20);

        System.out.println();
        MyQueue.displayQueue(queue);
    }
}
