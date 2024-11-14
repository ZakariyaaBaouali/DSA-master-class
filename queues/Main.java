package queues;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to queues ,  FIFO 🚀🚀🚀");

        QueueArray<String> orders = new QueueArray<>(3);

        orders.enQueue("order 1");
        orders.enQueue("order 2");
        orders.enQueue("order 3");

        System.out.println(orders);
    }
}
