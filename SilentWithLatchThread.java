package javatraining.oletsky.threads;

import java.util.concurrent.CountDownLatch;


public class SilentWithLatchThread extends Thread{
    private CountDownLatch latch;

    public SilentWithLatchThread(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread() +" finished");
        latch.countDown();
    }
}
