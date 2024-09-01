public class TestOfRecurse {
    public static void main(String[] args) {
        //counter(3);
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if(n == 1) return 1;

        return n * factorial(n -1);
    }

    public  static void counter(int n){
        if(n == 0) return;

        System.out.println(n);

        counter(n -1);

        System.out.println("line" + n);
    }
}
