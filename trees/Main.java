package trees;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello trees 👋👋");

        BinaryTree tree = new BinaryTree();
        int[] inputs = { 7, 4, 9, 1, 6, 8, 10 };

        for (var input : inputs)
            tree.insert(input);
    }
}
