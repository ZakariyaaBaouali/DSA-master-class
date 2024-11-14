package queues;

import java.util.Arrays;

public class QueueArray<T> {

    private Object[] items;
    private int front;
    private int back;

    public QueueArray(int capacity) {
        this.items = new Object[capacity];
    }

    public void enQueue(T item) {
        this.items[this.front++] = item;
    }

    public T deQueue() {
        return (T) this.items[this.back++];
    }

    public boolean isEmpty() {
        return this.back == 0 && this.front == 0;
    }

    public boolean isFull() {
        return this.back == this.front;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }

}
