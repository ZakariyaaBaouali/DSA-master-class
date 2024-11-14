package stacks;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello stacks LIFO 🚀🚀🚀");

        System.out.println(reverseString("hello"));
        System.out.println("Is balanced : " + balancedExp("({1 + 2)}"));

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