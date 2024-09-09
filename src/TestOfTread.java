import java.io.Console;
import java.util.Scanner;

public class TestOfTread {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread2 = new Thread(new MyThread2());
        MyThreadRunning myThreadRunning = new MyThreadRunning();
        myThreadRunning.start();
        Thread.sleep(2000);
        myThread2.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Hello from MAIN!!!");

        myThreadRunning.shoutDown();
    }
}

class MyThreadRunning extends Thread{
    private volatile boolean running = true;
    private int i = 0;
    @Override
    public void run() {
        while (running){
            System.out.println(ConsoleColors.RED + "Hello from MyThread1 n: " + i + ConsoleColors.RESET);
            try {
                Thread.sleep(1000);
                i++;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void shoutDown(){
        this.running = false;
    }
}

class MyThread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++){
            System.out.println(ConsoleColors.GREEN + "Hello from MyThread2 n: " + i + ConsoleColors.RESET);
        }
    }
}