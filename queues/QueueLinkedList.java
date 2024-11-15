package queues;

import java.util.Arrays;

public class QueueLinkedList<T> {

    private class Node {
        Object value;
        Node next;

        public Node(T item) {
            this.value = item;
            this.next = null;
        }

        @Override
        public String toString() {
            return this.value + "";
        }
    }

    private Node first;
    private Node last;
    private int count;

    // add last
    public void enQueue(T item) {
        var node = new Node(item);

        if (this.isEmpty())
            this.first = this.last = node;
        else {
            this.last.next = node;
            this.last = node;
        }

        this.count++;
    }

    public T deQueue() {
        T value;

        if (this.isEmpty())
            return null;
        else {
            value = (T) this.first.value;
            this.first = this.first.next;
        }

        this.count--;
        return value;
    }

    public boolean isEmpty() {
        return this.first == null;
    }

    private Object[] toArray() {
        var current = this.first;
        Object[] items = new Object[this.count];

        for (int i = 0; i < this.count; i++) {
            items[i] = current.value;
            current = current.next;
        }

        return items;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.toArray());
    }
}