package stacks;

public class StackLinkedList<T> {

    private class Node {
        Object value;
        Node next;

        @Override
        public String toString() {
            return value + "";
        }
    }

    private Node first;
    private Node last;

    public StackLinkedList() {
    }
}
