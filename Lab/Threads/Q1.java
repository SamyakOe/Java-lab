package Threads;

public class Q1 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();
    }
}

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Hello World");
            try {
                sleep(300);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted: " + e);
            }
        }
    }
}
