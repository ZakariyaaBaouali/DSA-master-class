package AVLTrees;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi AVT trees 👋👋");

        int[] inputs = { 30 , 10 , 20 };
        AVLTree tree = new AVLTree();

        for(var input : inputs)
            tree.insert(input);

        System.out.println("DONE");
    }
}
