package Threads;
class Message1 extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Messsage 1");
            try {
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted: "+e);
            }
        }
    }
}
class Message2 implements Runnable{
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println("Messsage 2");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted: "+e);
            }
        }
    }
}
public class Q3 {
    public static void main(String[] args) {
        Message1 t1=new Message1();
        t1.start();
        Thread t2=new Thread(new Message2());
        t2.start();
        
    }
}
