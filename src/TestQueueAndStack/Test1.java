package TestQueueAndStack;

import TestComporator.Person;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test1 {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Olson1");
        Person person2 = new Person(100, "Olson2");
        Person person3 = new Person(5, "Olson3");
        Person person4 = new Person(14, "Olson4");
        Person person5 = new Person(2, "Olson5");

        Queue<Person> people = new ArrayBlockingQueue<>(5);

        people.add(person1);
        people.add(person3);
        people.add(person5);
        people.add(person2);
        people.add(person4);
        System.out.println(people.offer(person1));

        System.out.println(people.remove());
        System.out.println(people.peek());
        System.out.println(people);
    }
}
