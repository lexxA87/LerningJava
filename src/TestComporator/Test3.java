package TestComporator;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        Set<Person> peopleTreeSet = new TreeSet<>();

        addPerson(peopleList);
        addPerson(peopleTreeSet);
        Collections.sort(peopleList);
        System.out.println(peopleList);
        System.out.println(peopleTreeSet);
    }

    private static void addPerson(Collection collection) {
        collection.add(new Person(5, "Lexx"));
        collection.add(new Person(100, "Mike"));
        collection.add(new Person(5, "Alex"));
        collection.add(new Person(5, "Aleks"));
        collection.add(new Person(1, "Katty"));
        collection.add(new Person(12, "Pol"));
    }
}
