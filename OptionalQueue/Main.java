package OptionalQueue;

public class Main {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue(4);
        queue.enQueue(4);
        queue.deQueue();
        queue.enQueue(56);
        queue.enQueue(2);
        queue.enQueue(67);
        queue.display();
        queue.deQueue();
        queue.deQueue();
        queue.display();
        queue.enQueue(24);
        queue.display();
        queue.deQueue();
        queue.enQueue(98);
        queue.enQueue(45);
        queue.enQueue(23);
        queue.display();
        queue.enQueue(435);
    }
    }
