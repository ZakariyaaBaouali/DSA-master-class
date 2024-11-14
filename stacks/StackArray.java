package stacks;

import java.util.Arrays;

public class StackArray<T> {

    private Object[] items;
    private int count;

    public StackArray(int capcity) {
        this.items = new Object[capcity];
    }

    public void push(T item) throws Exception {
        if (this.isFull())
            throw new Exception("Stack is full");
        this.items[this.count++] = item;
    }

    public T peek() {
        return (T) this.items[this.count - 1];
    }

    public T pop() throws Exception {
        if (!isEmpty())
            return (T) this.items[--this.count];
        else
            throw new Exception("Stack is empty");
    }

    public boolean isEmpty() {
        return this.count == 0;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }

    private boolean isFull() {
        return this.count == this.items.length;
    }
}
