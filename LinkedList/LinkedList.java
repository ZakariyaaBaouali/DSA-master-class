package LinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class LinkedList<T> {

    private class Node {
        Object value;
        Node next;

        public Node(T value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public void addLast(T item) {
        var node = new Node(item);

        if (this.isEmpty())
            this.first = this.last = node;
        else {
            this.last.next = node;
            this.last = node;
        }

        this.size++;
    }

    public void addFirst(T item) {
        var node = new Node(item);

        if (this.isEmpty())
            this.first = this.last = node;
        else
            node.next = this.first;
        this.first = node;

        this.size++;
    }

    public int indexOf(T item) {
        var current = this.first;
        var index = 0;

        while (current != null) {
            if (current.value.equals(item))
                return index;

            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean contains(T item) {
        return this.indexOf(item) >= 0;
    }

    public void removeLast() {
        if (this.isFirstAndLastEquals())
            this.first = this.last = null;
        else {
            var previous = this.findPrevious(this.last);
            previous.next = null;
            this.last = previous;
        }

        this.size--;
    }

    public void removeFirst() {
        if (this.isFirstAndLastEquals())
            this.first = this.last = null;
        else {
            var next = this.first.next;
            this.first = next;
        }

        this.size--;
    }

    public int Size() {
        return this.size;
    }

    public T[] toArray() {
        Object[] items = new Object[this.size];
        var current = this.first;

        for (int i = 0; i < this.size; i++) {
            items[i] = current.value;
            current = current.next;
        }

        return (T[]) items;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.toArray());
    }

    private boolean isEmpty() {
        return this.first == null;
    }

    private boolean isFirstAndLastEquals() {
        return this.first == this.last;
    }

    private Node findPrevious(Node node) {
        var current = this.first;
        while (current != null) {
            if (current.next.equals(node))
                break;
            current = current.next;
        }

        return current;
    }
}