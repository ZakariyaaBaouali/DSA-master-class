package queues;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to queues ,  FIFO 🚀🚀🚀");

        QueueArray<String> orders = new QueueArray<>(3);

        try {
            orders.enQueue("order 1");
            orders.enQueue("order 2");
            orders.enQueue("order 3");
            orders.enQueue("order 4");

            System.out.println(orders.deQueue());
            System.out.println(orders.deQueue());
            System.out.println(orders.deQueue());
            System.out.println(orders.deQueue());

            System.out.println(orders);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
