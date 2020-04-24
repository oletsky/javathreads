package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Demonstration of executing a thread extending Thread
 * Try to make the main thread wait until the other thread finishes
 */

public class DemoThreadExtendsThread {
    public static void main(String[] args) {
        Thread t = new MyThreadExtendThread();
        t.start();
        System.out.println("Application finished");
    }
}

class MyThreadExtendThread extends Thread {
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
