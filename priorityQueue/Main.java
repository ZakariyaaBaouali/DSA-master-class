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

        // test impl
        ArrayPriorityQueue queue2 = new ArrayPriorityQueue(5);
        queue2.enQueue(5);
        queue2.enQueue(1);
        queue2.enQueue(3);
        queue2.enQueue(2);
        queue2.enQueue(4);

        System.out.println(queue2);
    }
}
