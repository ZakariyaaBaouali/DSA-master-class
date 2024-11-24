package heaps;

import java.util.Arrays;

public class Heap {

    private int[] items;
    private int size;

    public Heap(int capacity){
        this.items = new int[capacity];
    }

    public void insert(int item){
        if(this.isFull())
            System.out.println("Heap is full");

        this.items[this.size++] = item;
        this.bubbleUp(this.size - 1);
    }

    private void bubbleUp(int itemIndex){
        while (itemIndex > 0 && this.items[itemIndex] > this.items[this.parentIndex(itemIndex)]){
            this.swap(itemIndex , this.parentIndex(itemIndex));
            itemIndex = parentIndex(itemIndex);
        }
    }

    private int parentIndex(int itemIndex){
        return (itemIndex - 1) / 2;
    }

    private void swap(int first , int second){
        var temp = this.items[first];
        this.items[first] = this.items[second];
        this.items[second] = temp;
    }

    public boolean isFull(){
        return this.size == this.items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(this.items);
    }
}
