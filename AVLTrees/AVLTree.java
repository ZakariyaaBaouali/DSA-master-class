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
        this.balance(root);
        return root;
    }


    //checking balance
    private void balance(AVLNode node){
        if(this.isRightHeavy(node)){
            if(this.balanceFactor(node.rightChild) > 0)
                System.out.println("Right rotate : " + node.rightChild.value);
            System.out.println("Left rotate : " + node.value);
        }
        else if(this.isLeftHeavy(node)){
            if(this.balanceFactor(node.leftChild) < 0)
                System.out.println("Left rotate : " + node.leftChild.value);
            System.out.println("Right rotate : " + node.value);
        }
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
