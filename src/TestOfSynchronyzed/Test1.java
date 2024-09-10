
package TestOfSynchronyzed;

import ConsoleColors.ConsoleColors;

public class Test1 {
    private int counter;

    private synchronized void implement() {
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
        Test1 test = new Test1();
        test.doWork();
    }

    private void doWork() throws InterruptedException {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    implement();
                }
                System.out.println(ConsoleColors.GREEN + "Thread 1 is done" + ConsoleColors.RESET);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    implement();
                }
                System.out.println(ConsoleColors.CYAN + "Thread 2 is done" + ConsoleColors.RESET);
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}
