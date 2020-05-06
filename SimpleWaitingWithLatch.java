package javatraining.oletsky.threads;

import java.util.concurrent.CountDownLatch;

/**
 * @author O.Oletsky
 * A program that waits for ending of all threads
 * using CountDownLatch
 *
 * */
public class SimpleWaitingWithLatch {
    public static void main(String[] args) {
        final int KOL_THREADS=10;
        CountDownLatch latch = new CountDownLatch(KOL_THREADS);
        for (int i = 0; i <KOL_THREADS ; i++) {
            new SilentWithLatchThread(latch).start();
        }
        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Application finished");
    }
}
