package TestComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(5, "Lexx"));
        people.add(new Person(100, "Mike"));
        people.add(new Person(1, "Katty"));
        people.add(new Person(12, "Pol"));

        System.out.println("Before: " + people);
        people.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if (o1.getId() > o2.getId()) {
                    return 1;
                } else if (o1.getId() < o2.getId()) {
                    return -1;
                } else return 0;
            }
        });

        System.out.println("After own sort: " + people);
    }
}

