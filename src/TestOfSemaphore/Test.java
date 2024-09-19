package TestOfSemaphore;

import ConsoleColors.ConsoleColors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(200);

        Connection connection = Connection.getConnection();

        for (int i = 0; i < 200; i++) {
            int finalI = i;
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work(finalI);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            });
        }

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
        System.out.println("Finally");
    }
}

// SINGLETON
class Connection {
    private int connectionCount;
    private static final Connection connection = new Connection();
    private Semaphore semaphore = new Semaphore(10);

    // THIS FOR SINGLETON
    private Connection() {
    }

    public static Connection getConnection() {
        return connection;
    }

    public void work(int idThread) throws InterruptedException {
        semaphore.acquire();
        try {
            doWork(idThread);
        } finally {
            semaphore.release();
        }
    }

    private void doWork(int idThread) throws InterruptedException {
        synchronized (this) {
            connectionCount++;
            System.out.println(ConsoleColors.GREEN + "Thread with id: "
                    + idThread + " incremented for " + connectionCount + ConsoleColors.RESET);
        }

        Thread.sleep(3000);

        synchronized (this) {
            connectionCount--;
            System.out.println(ConsoleColors.RED + "Thread with id: " + idThread +
                    " decremented for " + connectionCount + ConsoleColors.RESET);
        }
    }
}