import java.util.HashSet;
import java.util.Set;

public class TestOfSets {
    public static void main(String[] args) {
        Set<Integer> setOne = new HashSet<>();

        setOne.add(1);
        setOne.add(2);
        setOne.add(3);
        setOne.add(4);
        setOne.add(5);
        setOne.add(6);
        setOne.add(19);

        Set<Integer> setTwo = new HashSet<>();

        setTwo.add(5);
        setTwo.add(6);
        setTwo.add(7);
        setTwo.add(8);
        setTwo.add(9);
        setTwo.add(10);
        setTwo.add(15);

        // union
        Set<Integer> setUnion = new HashSet<>(setOne);
        setUnion.addAll(setTwo);
        System.out.println(setUnion);

        // intersection
        Set<Integer> setIntersection = new HashSet<>(setOne);
        setIntersection.retainAll(setTwo);
        System.out.println(setIntersection);

        // difference
        Set<Integer> setDiff = new HashSet<>(setOne);
        setDiff.removeAll(setTwo);
        System.out.println(setDiff);
    }
}
