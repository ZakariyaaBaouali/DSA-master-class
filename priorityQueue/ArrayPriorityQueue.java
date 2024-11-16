package priorityQueue;

import java.util.Arrays;

public class ArrayPriorityQueue {

    private int[] items;
    private int count;

    public ArrayPriorityQueue(int capacity) {
        this.items = new int[capacity];
    }

    public void enQueue(int item) {
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

    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }
}
