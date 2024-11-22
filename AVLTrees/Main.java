package AVLTrees;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hi AVT trees 👋👋");

        int[] inputs = { 10 , 20 , 30 };
        AVLTree tree = new AVLTree();

        for(var input : inputs)
            tree.insert(input);

        System.out.println("DONE");
    }
}
