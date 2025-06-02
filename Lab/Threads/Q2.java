package Threads;

class Myrunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted: " + e);
            }
        }
    }
}

public class Q2 {
    public static void main(String[] args) {
        Myrunnable runnable = new Myrunnable();
        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
