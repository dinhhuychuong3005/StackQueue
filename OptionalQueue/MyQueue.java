package OptionalQueue;

public class MyQueue {
    private int capacity;
    private int [] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;
    public MyQueue(int size){
        this.capacity = size;
        queueArr = new int[size];
    }
    public boolean isQueueFull(){
        if (currentSize == capacity){
            return true;
        }
        return false;
    }
    public boolean isQueueEmpty(){
        if (currentSize == 0){
            return true;
        }
        return false;
    }
    public void enQueue(int item){
        if (isQueueFull()){
            System.out.println("không thể thêm phần tử: " + item);
        }else {
            tail++;
            if (tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
        }
    }
    public void deQueue(){
        if (isQueueEmpty()){
            System.out.println("không thể xóa phần tử");
        }else {
            head++;
            if (head == capacity - 1){
                System.out.println("đã xóa: " + queueArr[head - 1] + " khỏi hàng chờ");
                head = 0;
            }else {
                System.out.println("đã xóa: " + queueArr[head - 1] + " khỏi hàng chờ");
            }
            currentSize--;
        }
    }
    public void display(){
        for (int i = 0; i < currentSize; i++) {
            System.out.println(queueArr[i]);
        }
    }
}
