package TestOfHashCodeAndEquals;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TestOfHashCodeAndEqualsContract {
    public static void main(String[] args) {
        Map<Person, String> map = new HashMap<>();
        Set<Person> set = new HashSet<>();

        Person person1 = new Person(1, "Molly");
        Person person2 = new Person(1, "Molly");
        Person person3 = new Person(3, "Linda");

        map.put(person1, "123");
        map.put(person2, "234");
        map.put(person3, "098");

        set.add(person1);
        set.add(person2);
        set.add(person3);

        System.out.println(map);
        System.out.println(set);

    }
}
