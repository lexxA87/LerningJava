
import ConsoleColors.ConsoleColors;

import java.util.Scanner;

public class TestOfTread {
    public static void main(String[] args) throws InterruptedException {
        //Thread myThread2 = new Thread(new MyThread2());
        MyThreadRunning myThreadRunning = new MyThreadRunning();
        myThreadRunning.start();
        //Thread.sleep(2000);
        //myThread2.start();

        while (myThreadRunning.getI() < 51) {
            Thread.sleep(1000);
            //System.out.println("While loop");
        switch (myThreadRunning.getI()){
            case 10:
                System.out.println( ConsoleColors.CYAN + "Already 10!!!" + ConsoleColors.RESET);
                break;
            case 20:
                System.out.println( ConsoleColors.CYAN + "Already 20!!!" + ConsoleColors.RESET);
                break;
            case 30:
                System.out.println( ConsoleColors.CYAN + "Already 30!!!" + ConsoleColors.RESET);
                break;
            case 40:
                System.out.println( ConsoleColors.CYAN + "Already 40!!!" + ConsoleColors.RESET);
                break;
            case 50:
                System.out.println( ConsoleColors.CYAN + "Already 50!!!" + ConsoleColors.RESET);
                break;
        }
        }


        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Hello from MAIN!!!");

        myThreadRunning.shoutDown();
    }
}

class MyThreadRunning extends Thread{
    private volatile boolean running = true;
    private volatile int i = 0;
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

    public int getI() {
        return i;
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