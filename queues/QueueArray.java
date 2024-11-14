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

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }

}
