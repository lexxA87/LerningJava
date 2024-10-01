package TestOfLambdaExp;

interface Executable {
    int execute(int x, int y);
}

class Runner {
    public void run(Executable e) {
        int a = e.execute(10, 30);
        System.out.println(a);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Runner runner = new Runner();

        int a = 3;
        runner.run(new Executable() {
            @Override
            public int execute(int x, int y) {  // can realize more than one method in interface
                int a = 4; // has own scope for variables
                return x + y + a;
            }
        });

        // should be final
        int b = 3;
        runner.run((x,y) -> x + y + a + b); // only with ONE method in interface
    }
}
