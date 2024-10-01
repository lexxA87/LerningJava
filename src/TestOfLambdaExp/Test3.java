package TestOfLambdaExp;

import java.util.*;
import java.util.stream.Collectors;

public class Test3 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        List<Integer> list1 = new ArrayList<>();

        fillArray(arr1);
        fillList(list1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
        System.out.println("***");

        // map method
        arr1 = Arrays.stream(arr1).map(a -> a * 2).toArray();
        list1 = list1.stream().map(a -> a * 3).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
        System.out.println("***");

        // filter method
        arr1 = Arrays.stream(arr1).filter(a -> a % 3 == 0).toArray();
        list1 = list1.stream().filter(a -> a % 2 != 0).collect(Collectors.toList());

        System.out.println(Arrays.toString(arr1));
        System.out.println(list1);
        System.out.println("***");

        // reduce method
        int sum = Arrays.stream(arr1).reduce(Integer::sum).getAsInt();
        int product = list1.stream().reduce((acc, a) -> acc * a).get();
        System.out.println(sum);
        System.out.println(product);
        System.out.println("***");

        // forEach method
        Arrays.stream(arr1).forEach(System.out::println);
        list1.stream().forEach(System.out::println);
        System.out.println("***");

        // line of methods
        int[] arr2 = Arrays.stream(arr1).filter(a -> a % 4 != 0).map(a -> a * 3).toArray();
        System.out.println(Arrays.toString(arr2));
        System.out.println("***");

        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(3);
        set.add(23);
        set.add(5);
        System.out.println(set);
        set = set.stream().map(a -> a * 3).collect(Collectors.toSet());
        System.out.println(set);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < 10; i++) {
            array[i] = i +1;
        }
    }

    private static void fillList(List<Integer> list) {
        for (int i = 0; i < 10; i++) {
            list.add(i +1);
        }
    }
}
