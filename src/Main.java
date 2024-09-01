import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter something");
        String str = s.nextLine();
        System.out.println("Enter some number");
        int x = s.nextInt();
        System.out.println("You entered: " + str + " and " + x);

    }
}