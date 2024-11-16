package priorityQueue;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hallo priority queues 👋👋");

        // Java impl
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(1);
        queue.add(3);
        queue.add(2);

        while (!queue.isEmpty())
            System.out.println(queue.remove());
    }
}
