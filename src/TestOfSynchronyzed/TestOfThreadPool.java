package TestOfSynchronyzed;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestOfThreadPool {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 9; i++) {
            executorService.submit(new SomeWork(i));
        }

        executorService.shutdown();
        System.out.println("All tasks was submitted");

        executorService.awaitTermination(3, TimeUnit.HOURS);
    }
}

class SomeWork implements Runnable {
    private  int id;

    public SomeWork(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work n:" + id + " was completed");
    }
}