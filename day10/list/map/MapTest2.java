package list.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");
        map.put(5, "E");

        Collection<String> values = map.values();
        System.out.println(values.size());
        System.out.println(values);
        for (String a : values) {
            System.out.println(a);
        }


    }
}
