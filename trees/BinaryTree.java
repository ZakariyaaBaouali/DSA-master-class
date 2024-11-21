package trees;

import java.util.LinkedList;

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
    private LinkedList<Integer> items;

    public BinaryTree() {
        this.items = new LinkedList<>();
    }

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

    // Traversal
    public LinkedList<Integer> preOrderTraversal() {
        this.items.clear();
        this.preOrderTraversal(this.root);
        return this.items;
    }

    private void preOrderTraversal(Node root) {
        // stop / base condition
        if (this.isLeaf(root)) {
            this.items.add(root.value);
            return;
        }

        this.items.add(root.value);
        this.preOrderTraversal(root.leftChild);
        this.preOrderTraversal(root.rightChild);
    }

    private boolean isLeaf(Node node) {
        return node.rightChild == null && node.leftChild == null;
    }

    public LinkedList<Integer> inOrderTraversal() {
        this.items.clear();
        this.inOrderTraversal(this.root);
        return this.items;
    }

    private void inOrderTraversal(Node root) {
        if (this.isLeaf(root)) {
            this.items.add(root.value);
            return;
        }

        this.inOrderTraversal(root.leftChild);
        this.items.add(root.value);
        this.inOrderTraversal(root.rightChild);
    }

    public LinkedList<Integer> postOrderTraversal() {
        this.items.clear();
        this.postOrderTraversal(this.root);
        return this.items;
    }

    private void postOrderTraversal(Node root) {
        if (this.isLeaf(root)) {
            this.items.add(root.value);
            return;
        }

        this.postOrderTraversal(root.leftChild);
        this.postOrderTraversal(root.rightChild);
        this.items.add(root.value);
    }

    public int highOfTree() {
        return this.highOfTree(this.root);
    }

    private int highOfTree(Node root) {
        if (this.isLeaf(root))
            return 0;

        int highLeft = this.highOfTree(root.leftChild);
        int highRight = this.highOfTree(root.rightChild);
        return Math.max(highLeft, highRight) + 1;
    }
}
