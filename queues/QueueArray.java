package queues;

import java.util.Arrays;

public class QueueArray<T> {

    private Object[] items;
    private int front;
    private int back;
    private int count;

    public QueueArray(int capacity) {
        this.items = new Object[capacity];
    }

    public void enQueue(T item) throws Exception {
        if (this.isFull())
            throw new Exception("Queue is Full");
        this.items[this.front] = item;
        this.front = (this.front + 1) % this.items.length;
        this.count++;
    }

    public T deQueue() throws Exception {
        if (this.isEmpty())
            throw new Exception("Queue is empty");

        var item = (T) this.items[this.back];
        this.items[this.back] = 0;
        this.back = (this.back + 1) % this.items.length;
        this.count--;
        return item;

    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    public boolean isFull() {
        return this.count == this.items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }

}
