package hashTables;

import java.util.HashMap;
import java.util.Map;

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
    }
}