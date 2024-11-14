package stacks;

public class StackLinkedList<T> {

    private class Node {
        Object value;
        Node next;

        public Node(T value) {
            this.value = value;
            this.next = null;
        }

        @Override
        public String toString() {
            return value + "";
        }
    }

    private Node first;

    public StackLinkedList() {
    }

    // add first impl...
    public void push(T item) {
        var node = new Node(item);

        if (this.isEmpty())
            this.first = node;
        else {
            node.next = this.first;
            this.first = node;
        }

    }

    // remove first impl...
    public T pop() throws Exception {
        if (this.isEmpty())
            throw new Exception("Stack is empty");

        var temp = this.first.next;
        T value = (T) this.first.value;
        this.first = temp;
        return value;
    }

    public boolean isEmpty() {
        return this.first == null;
    }
}
