package heaps;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello heaps 👋👋");

        Heap heap = new Heap(10);
        int[] inputs = {10 , 5 , 17 , 4 , 22};

        for(var input : inputs)
            heap.insert(input);

        System.out.println(heap);
    }
}
