package TestReentrantLock;

import ConsoleColors.ConsoleColors;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.firstThread();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                task.secondThread();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        task.showCount();
    }
}

class Task {
    private int count;
    private Lock lock = new ReentrantLock();

    private void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
        }
    }

    public void firstThread() {
        lock.lock();
        increment();
        System.out.println(ConsoleColors.BLUE + "first thread " + count + ConsoleColors.RESET);
        lock.unlock();
    }

    public  void secondThread() {
        lock.lock();
        increment();
        System.out.println(ConsoleColors.GREEN + "second thread " + count + ConsoleColors.RESET);
        lock.unlock();
    }

    public void showCount() {
        System.out.println(count);
    }
}