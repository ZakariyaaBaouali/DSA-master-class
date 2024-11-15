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

}