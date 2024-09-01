import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestOfDefSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedHaashSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();

        testSets(hashSet, "hashSet");
        testSets(linkedHaashSet, "linkedHashSet");
        testSets(treeSet, "treeSet");

        System.out.println(hashSet.isEmpty());
        System.out.println(linkedHaashSet.contains("Lex"));
        System.out.println(treeSet.contains("Tom"));
        System.out.println(treeSet);
    }

    public  static void testSets(Set<String> set, String name) {
        set.add("Tom");
        set.add("Tim");
        set.add("Kim");
        set.add("lex");
        set.add("Pol");
        set.add("Roy");

        System.out.println(name);
        for(String str : set){
            System.out.println(str);
        }
    }
}
