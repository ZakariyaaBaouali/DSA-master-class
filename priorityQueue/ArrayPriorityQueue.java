package priorityQueue;

import java.util.Arrays;

public class ArrayPriorityQueue {

    private int[] items;
    private int count;
    private int back;

    public ArrayPriorityQueue(int capacity) {
        this.items = new int[capacity];
    }

    public void enQueue(int item) throws Exception {
        if (this.isFull())
            throw new Exception("Prioriy queue is full 👋");

        int i;
        for (i = this.count - 1; i >= 0; i--) {
            if (this.items[i] > item)
                this.items[i + 1] = this.items[i];
            else
                break;
        }

        this.items[i + 1] = item;
        this.count++;
    }

    public int deQueue() throws Exception {
        if (this.isEmpty())
            throw new Exception("Priority Queue is Empty 👋");

        return this.items[this.back++];
    }

    public boolean isEmpty() {
        return this.back == this.count;
    }

    public boolean isFull() {
        return this.count == this.items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }
}
