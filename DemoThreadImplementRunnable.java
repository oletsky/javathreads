package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Demonstration of executing a thread implementing Runnable
 */

public class DemoThreadImplementRunnable {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThreadImplementsRunnable());
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Application finished");
    }
}

class MyThreadImplementsRunnable implements Runnable {
    @Override
    public void run() {
        for (int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(Thread.currentThread() +" finished");
    }
}