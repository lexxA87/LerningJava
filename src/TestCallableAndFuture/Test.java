package TestCallableAndFuture;

import java.util.Random;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> future = executorService.submit(() -> {
            System.out.println("Starting...");
            Thread.sleep(1000);
            System.out.println("Finished...");

            Random random = new Random();
            int randomValue = random.nextInt(11);

            if(randomValue < 6)
                throw new Exception("Something's wrong");

            return randomValue;
        });

        executorService.shutdown();
        try {
            int result = future.get();
            System.out.println(result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            Throwable ex = e.getCause();
            System.out.println(ex.getMessage());
        }
    }
}
