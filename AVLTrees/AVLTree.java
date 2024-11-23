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

        this.setHeight(root);
        return this.balance(root);
    }


    //checking balance
    private AVLNode balance(AVLNode node){
        if(this.isRightHeavy(node)){
            if(this.balanceFactor(node.rightChild) > 0)
                node.rightChild = this.rightRotation(node.rightChild);
            return this.leftRotation(node);
        }
        else if(this.isLeftHeavy(node)){
            if(this.balanceFactor(node.leftChild) < 0)
                node.leftChild = this.leftRotation(node.leftChild);
            return this.rightRotation(node);
        }

        return node;
    }

    private AVLNode leftRotation(AVLNode root){
        var newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;

        this.setHeight(root);
        this.setHeight(newRoot);
        return newRoot;
    }

    private AVLNode rightRotation(AVLNode root){
        var newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;

        this.setHeight(root);
        this.setHeight(newRoot);
        return newRoot;
    }

    private void setHeight(AVLNode node){
        node.height = Math.max(this.height(node.leftChild) , this.height(node.rightChild)) + 1;
    }

    public boolean isEmpty(){
        return this.root == null;
    }

    private int height(AVLNode node){
        return node == null ? -1 : node.height;
    }

    private int balanceFactor(AVLNode node){
        return this.height(node.leftChild) - this.height(node.rightChild);
    }

    private boolean isLeftHeavy(AVLNode node){
        return this.balanceFactor(node) > 1;
    }

    private boolean isRightHeavy(AVLNode node){
        return this.balanceFactor(node) < -1;
    }
}
