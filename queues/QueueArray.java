package queues;

public class QueueArray<T> {

    private Object[] items;
    private int front;
    private int back;

    public QueueArray(int capacity) {
        this.items = new Object[capacity];
    }

}
