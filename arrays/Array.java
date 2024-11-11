package arrays;

import java.util.Arrays;

public class Array<T> {

    private Object[] items;
    private int count;

    public Array(int capacity) {
        this.items = new Object[capacity];
    }

    public void insert(T item) {
        this.checkCapacity();
        this.items[this.count++] = item;
    }

    public void remove(int index) {
        for (int i = index; i < this.items.length - 1; i++) {
            // item[i] <--- item[ i + 1]
            this.items[i] = this.items[i + 1];
        }
    }

    private void checkCapacity() {
        if (this.count == this.items.length) {
            Object[] newItems = new Object[this.count * 2];
            for (int i = 0; i < this.count; i++) {
                newItems[i] = this.items[i];
            }
            this.items = newItems;
        }
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }
}
