package stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello stacks LIFO 🚀🚀🚀");

        System.out.println(reverseString("hello"));
        System.out.println("Is balanced : " + balancedExp("({1 + 2)}"));

        StackArray<String> names = new StackArray<>(3);
        try {
            names.push("zakaria");
            names.push("tesla");
            names.push("meta");

            System.out.println(names.pop());
            System.out.println(names.pop());
            System.out.println(names.pop());
            System.out.println(names.pop());

            System.out.println(names);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static String reverseString(String str) {
        Stack<Character> chars = new Stack<>();
        StringBuilder revStr = new StringBuilder();

        for (char ch : str.toCharArray())
            chars.push(ch);

        while (!chars.isEmpty()) {
            revStr.append(chars.pop());
        }

        return revStr.toString();
    }

    public static boolean balancedExp(String str) {
        Stack<Character> chars = new Stack<>();

        for (char ch : str.toCharArray()) {
            switch (ch) {
                case '(':
                    chars.push(ch);
                    break;
                case ')':
                    chars.pop();
                    break;
                case '[':
                    chars.push(ch);
                    break;
                case ']':
                    chars.pop();
                    break;
                case '{':
                    chars.push(ch);
                    break;
                case '}':
                    chars.pop();
                    break;
            }
        }

        return chars.isEmpty();
    }
}