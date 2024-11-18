package hashTables;

import java.util.LinkedList;

public class HashTable {

    private class Entry {
        private int key;
        private String value;

        private Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries;

    public HashTable(int capacity) {
        this.entries = new LinkedList[capacity];
    }

    public void put(int key, String value) {
        var index = this.hash(key);
        if (this.entries[index] == null)
            this.entries[index] = new LinkedList<>();

        var bucket = this.getBucket(key);
        for (var entry : bucket) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        var bucket = this.getBucket(key);
        for (var entry : bucket) {
            if (entry.key == key)
                return entry.value;
        }

        return null;
    }

    private int hash(int key) {
        return key % this.entries.length;
    }

    private LinkedList<Entry> getBucket(int key) {
        return this.entries[this.hash(key)];
    }
}
