package LinkedList;

import java.util.ArrayList;

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

    public void addLast(T item) {
        var node = new Node(item);

        if (this.isEmpty())
            this.first = this.last = node;
        else {
            this.last.next = node;
            this.last = node;
        }

    }

    public void addFirst(T item) {
        var node = new Node(item);

        if (this.isEmpty())
            this.first = this.last = node;
        else
            node.next = this.first;
        this.first = node;
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

    @Override
    public String toString() {
        ArrayList<Object> items = new ArrayList<>();
        var cuurent = this.first;
        while (cuurent != null) {
            items.add(cuurent.value);
            cuurent = cuurent.next;
        }
        return items.toString();
    }

    private boolean isEmpty() {
        return this.first == null;
    }
}