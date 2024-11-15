package queues;

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

    public boolean isEmpty() {
        return this.first == null;
    }
}