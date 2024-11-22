package AVLTrees;

import java.lang.invoke.VarHandle;

public class AVLTree {

    private class AVLNode {
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;

        public AVLNode(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + this.value;
        }
    }

    private AVLNode root;

    public void insert(int value){
        this.root = this.insert(this.root ,value);
    }

    private AVLNode insert(AVLNode root , int value){
        if(root == null)
            return new AVLNode(value);

        if(value > root.value)
            root.rightChild = this.insert(root.rightChild , value);
        else
            root.leftChild = this.insert(root.leftChild , value);

        return root;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

}
