package hashTables;

import java.util.Arrays;
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
        var entry = this.getBucketEntry(key);
        if (entry != null) {
            entry.value = value;
        }

        bucket.addLast(new Entry(key, value));
    }

    public String get(int key) {
        return this.getBucketEntry(key).value;
    }

    public void remove(int key) throws Exception {
        var bucket = this.getBucket(key);
        if (bucket == null)
            throw new Exception("Bucket with key " + key + " is null");

        bucket.remove(this.getBucketEntry(key));
    }

    @Override
    public String toString() {
        return Arrays.toString(this.ToArray());
    }

    // private methods
    private int hash(int key) {
        return key % this.entries.length;
    }

    private LinkedList<Entry> getBucket(int key) {
        return this.entries[this.hash(key)];
    }

    private Entry getBucketEntry(int key) {
        var bucket = this.getBucket(key);
        for (var entry : bucket) {
            if (entry.key == key) {
                return entry;
            }
        }

        return null;
    }

    private String[] ToArray() {
        String[] items = new String[this.entries.length];
        for (int i = 0; i < items.length; i++) {
            var bucket = this.entries[i];
            var count = 1;

            if (bucket == null)
                continue;

            for (var entry : bucket) {
                if (count == 1) {
                    items[i] = entry.key + "=" + entry.value;
                    count++;
                } else
                    items[i] += "," + entry.value;
            }
        }

        return items;
    }
}
