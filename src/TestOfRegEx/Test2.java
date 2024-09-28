package TestOfRegEx;

import java.util.Arrays;

public class Test2 {
    public static void main(String[] args) {
        String str = "Hello world hey";
        String str2 = "Hello1321e123hey1311459fuck343ro";
        String[] arrStr = str.split(" ");
        String[] arrStr2 = str2.split("\\d+");
        System.out.println(Arrays.toString(arrStr));
        System.out.println(Arrays.toString(arrStr2));

        String a = "Hello1321e123hey1311459fuck343ro";
        String modStr1 = a.replaceAll("\\d+", "==");
        String modStr2 = a.replaceFirst("\\d+", "-");
        System.out.println(a);
        System.out.println(modStr1);
        System.out.println(modStr2);
    }
}
