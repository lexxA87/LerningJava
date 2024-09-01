import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestOfLists {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();

        //measureTimeOfAdd(arrayList, "arrayList");
        //measureTimeOfAdd(linkedList, "linkedList");

        //measureTimeOfGet(arrayList, "arrayList");
        //measureTimeOfGet(linkedList, "linkedList");

        measureTimeOfAddToFirst(arrayList, "arrayList");
        measureTimeOfAddToFirst(linkedList, "linkedList");
    }

    private static void measureTimeOfAdd(List<Integer> list, String name){
        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.add(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(name + " : " + (end - start));
    }

    private static void measureTimeOfGet(List<Integer> list, String name){
        for(int i = 0; i < 100000; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.get(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(name + " : " + (end - start));
    }

    private static void measureTimeOfAddToFirst(List<Integer> list, String name){
        long start = System.currentTimeMillis();

        for(int i = 0; i < 100000; i++){
            list.addFirst(i);
        }

        long end = System.currentTimeMillis();

        System.out.println(name + " : " + (end - start));
    }
}
