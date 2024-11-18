package trees;

public class BinaryTree {

    private class Node {
        private int value;
        private Node rightChild;
        private Node leftChild;

        private Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node=" + this.value;
        }
    }

    private Node root;

    public void insert(int value) {
        var node = new Node(value);

        if (this.isEmpty()) {
            this.root = node;
            return;
        }

        var current = this.root;
        while (true) {
            if (value > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = node;
                    return;
                }
                current = current.rightChild;
            } else {
                if (current.leftChild == null) {
                    current.leftChild = node;
                    return;
                }
                current = current.leftChild;
            }
        }
    }

    public boolean find(int value) {
        var current = this.root;
        while (current != null) {
            if (current.value == value)
                return true;
            else if (value > current.value)
                current = current.rightChild;
            else
                current = current.leftChild;
        }

        return false;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

}
