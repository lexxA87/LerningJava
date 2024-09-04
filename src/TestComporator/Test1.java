package TestComporator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Soda");
        strings.add("a");
        strings.add("Key");
        strings.add("united");
        strings.add("Hamelion");

        System.out.println(strings);
        Collections.sort(strings);
        System.out.println(strings);
        //strings.sort(new StringLengthComparator()); OR
        strings.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()){
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else return 0;
            }
        });
        System.out.println("After own sort: " + strings);


        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(4);
        numbers.add(100);
        numbers.add(-4);
        numbers.add(-200);
        numbers.add(400);

        System.out.println("Before: " + numbers);
        Collections.sort(numbers);
        System.out.println("After standard sort: " + numbers);
        numbers.sort(new IntegerComparator());
        System.out.println("After own sort: " + numbers);
    }
}

class IntegerComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1 > o2){
            return -1;
        } else if (o1 < o2) {
            return 1;
        } else return 0;
    }
}

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() > o2.length()){
            return 1;
        } else if (o1.length() < o2.length()) {
            return -1;
        } else return 0;
    }
}
