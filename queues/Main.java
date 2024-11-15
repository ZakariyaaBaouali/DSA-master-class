package queues;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to queues ,  FIFO 🚀🚀🚀");

        QueueArray<String> orders = new QueueArray<>(3);

        try {
            orders.enQueue("order 1");
            orders.enQueue("order 2");

            System.out.println(orders.deQueue());

            orders.enQueue("order 3");
            orders.enQueue("order 4");

            System.out.println(orders);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // JAVA IMPLEMENTATION FOR QUEUE
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        reverseQueue(queue);
    }

    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new ArrayDeque<>();

        while (!q.isEmpty()) {
            stack.push(q.remove());
        }

        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        System.out.println("reversed Queue : " + queue);
    }
}
