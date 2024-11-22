package AVLTrees;

import java.lang.invoke.VarHandle;

public class AVLTree {

    private class AVLNode {
        private int value;
        private AVLNode leftChild;
        private AVLNode rightChild;
        private int height;

        public AVLNode(int value , int height) {
            this.value = value;
            this.height = height;
        }

        @Override
        public String toString() {
            return "Node = " + this.value + " Height : " + this.height;
        }
    }

    private AVLNode root;

    public void insert(int value){
        this.root = this.insert(this.root ,value);
    }

    private AVLNode insert(AVLNode root , int value){
        if(root == null)
            return new AVLNode(value , 0);

        if(value > root.value)
            root.rightChild = this.insert(root.rightChild , value);
        else
            root.leftChild = this.insert(root.leftChild , value);


        root.height = Math.max(this.height(root.leftChild) , this.height(root.rightChild)) + 1;
        return root;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    private int height(AVLNode node){
        return node == null ? -1 : node.height;
    }

}
