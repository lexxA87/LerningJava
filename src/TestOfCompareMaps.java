import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestOfCompareMaps {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        Map<Integer, String> linkedMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMaps(map, "HashMap");
        testMaps(linkedMap, "LinkedHashMap");
        testMaps(treeMap, "TreeMap");
    }

    public static void testMaps(Map<Integer, String> map, String name) {
        map.put(5, "Five");
        map.put(12, "eleven");
        map.put(1, "One");
        map.put(7, "Seven");
        map.put(2, "Two");
        map.put(23, "23");
        map.put(3, "Three");
        map.put(1900, "1900");
        map.put(4, "Four");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(name + " : " + map);
    }
}
