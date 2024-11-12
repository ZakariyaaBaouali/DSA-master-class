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

    public void removeLast() {
        if (this.isFirstAndLastEquals())
            this.first = this.last = null;
        else {
            var previous = this.findPrevious(this.last);
            previous.next = null;
            this.last = previous;
        }

    }

    public void removeFirst() {
        if (this.isFirstAndLastEquals())
            this.first = this.last = null;
        else {
            var next = this.first.next;
            this.first = next;
        }
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