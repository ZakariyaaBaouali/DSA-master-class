package trees;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello trees 👋👋");

        BinaryTree tree = new BinaryTree();
        int[] inputs = { 7, 4, 9, 1, 6, 8, 11 , 10 , 12 };

        for (var input : inputs)
            tree.insert(input);

        System.out.println(tree.find(100));

        // factorial impl
        System.out.println("factorial of 4 : " + factorial(4));

        // Traversal
        System.out.println("Pre Order traversal");
        var items = tree.preOrderTraversal();
        System.out.println(items);

        System.out.println("in Order traversal");
        var items2 = tree.inOrderTraversal();
        System.out.println(items);

        System.out.println("post Order traversal");
        var items3 = tree.postOrderTraversal();
        System.out.println(items);

        //high of the tree
        System.out.println("High of the tree is : " + tree.highOfTree());

        //Min of the tree
        System.out.println("Min of the tree is : " + tree.getMin());

        //Max of the tree
        System.out.println("Max of the tree is : " + tree.getMax());

        //equal trees
        BinaryTree tree1 = new BinaryTree();
        int[] inputs2 = { 7, 4, 9, 1, 6, 8, 11 , 10 , 13 };

        for (var input : inputs2)
            tree1.insert(input);

        System.out.println("check quality for 2 trees : " + tree.equals(tree1));


        //Valid BST
        System.out.println("Is a valid BinarySearch Tree : " + tree.isBinarySearchTree());

        //nodes k distance from root
        System.out.println("k distance from root : " + tree.kDistanceFromRoot(3));
    }

    public static int factorial(int number) {
        // stop condition
        if (number == 1)
            return number;

        return number * factorial(number - 1);
    }
}
