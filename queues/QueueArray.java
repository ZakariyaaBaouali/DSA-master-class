package queues;

import java.util.Arrays;

public class QueueArray<T> {

    private Object[] items;
    private int front;
    private int back;

    public QueueArray(int capacity) {
        this.items = new Object[capacity];
    }

    public void enQueue(T item) throws Exception {
        if (this.isFull())
            throw new Exception("Queue is Full");
        this.items[this.front++] = item;
    }

    public T deQueue() throws Exception {
        if (this.isEmpty())
            throw new Exception("Queue is empty");
        return (T) this.items[this.back++];
    }

    public boolean isEmpty() {
        return this.front == this.back;
    }

    public boolean isFull() {
        return this.front == this.items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }

}
