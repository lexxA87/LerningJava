package TestCountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(3);

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 4; i++) {
            executorService.submit(new Processor(i, countDownLatch));
        }
        executorService.shutdown();

        for (int i = 0; i < 4; i++) {
            Thread.sleep(2000);
            countDownLatch.countDown();
        }

        System.out.println("Main thread");
    }
}

class Processor implements Runnable {

    private int id;
    private CountDownLatch countDownLatch;

    Processor(int id, CountDownLatch countDownLatch) {
        this.id = id;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Thread with id: " + id + " processed");
    }
}
