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

        // Sets impl
        int[] numbers = { 1, 2, 3, 3, 4, 1, 5, 5, 5 };
        removeDuplicates(numbers);
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
}