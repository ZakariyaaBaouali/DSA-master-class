package LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hi LinkedList 🚀🚀🚀");

        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.addFirst(10);
        numbers.addFirst(20);
        numbers.addFirst(30);

        System.out.println("Index of  : " + numbers.indexOf(100));
        System.out.println("Is item avilaible : " + numbers.contains(10));

        numbers.removeFirst();
        numbers.removeFirst();
        numbers.removeFirst();

        System.out.println("New size of the linkedlist is : " + numbers.Size());

        System.out.println(numbers);
    }

}
