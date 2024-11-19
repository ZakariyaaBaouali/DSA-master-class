package trees;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello trees 👋👋");

        BinaryTree tree = new BinaryTree();
        int[] inputs = { 7, 4, 9, 1, 6, 8, 10 };

        for (var input : inputs)
            tree.insert(input);

        System.out.println(tree.find(100));

        // factorial impl
        System.out.println("factorial of 4 : " + factorial(4));

        // Traversal
        var items = tree.preOrderTraversal();
        System.out.println(items);
    }

    public static int factorial(int number) {
        // stop condition
        if (number == 1)
            return number;

        return number * factorial(number - 1);
    }
}
