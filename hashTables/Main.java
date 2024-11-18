package hashTables;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello Hash Tables 👋👋");

        // Java impl
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "mosh");
        map.put(2, "zak");
        map.put(3, "mary");
        map.put(4, "marianne");

        map.remove(4);

        System.out.println(map.get(2));
        System.out.println(map.containsKey(5));
        System.out.println(map.containsValue("mosh"));

        System.out.println(map);
        System.out.println("First not repeated character is : " + firstNotRepChar("a green apple"));
        System.out.println("First repeated character is : " + firstRepChar("green apple"));

        // Sets impl
        int[] numbers = { 1, 2, 3, 3, 4, 1, 5, 5, 5 };
        removeDuplicates(numbers);

        // hashing
        System.out.println("hash a key to proper index : " + hashFunction("123456-A"));

        // hash table imp
        HashTable table = new HashTable(5);
        table.put(1, "zak");
        table.put(15, "mosh");

        System.out.println(table.get(15));
    }

    public static char firstNotRepChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        char[] chars = str.toCharArray();
        for (char item : chars) {
            int count = map.containsKey(item) ? map.get(item) : 0;
            map.put(item, count + 1);
        }

        for (char item : chars) {
            if (map.get(item) == 1)
                return item;
        }

        return Character.MIN_VALUE;
    }

    public static void removeDuplicates(int[] numbres) {
        Set<Integer> set = new HashSet<>();

        for (var number : numbres)
            set.add(number);

        System.out.println(set);
    }

    public static char firstRepChar(String str) {
        Set<Character> set = new HashSet<>();

        for (var item : str.toCharArray()) {
            if (set.contains(item))
                return item;
            else
                set.add(item);
        }

        return Character.MIN_VALUE;
    }

    public static int hashFunction(int key) {
        // imagine size of the array is 100;
        return key % 100;
    }

    public static int hashFunction(String key) {
        // imagine size of the array is 100;
        int hash = 0;
        for (char ch : key.toCharArray())
            hash += ch;

        return hash % 100;
    }
}