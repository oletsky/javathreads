package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * A program that waits for ending of all threads
 * Pointers to threads are stored in the array.
 * This has to be refactored
 */
public class SimpleWaitingWithoutLatch {
    public static void main(String[] args) throws InterruptedException {
        final int KOL_THREADS=10;
        Thread[] threads = new Thread[KOL_THREADS];
        for (int i = 0; i <KOL_THREADS ; i++) {
            Thread t = new SilentThread();
            threads[i]=t;
            t.start();
        }
        for (int i = 0; i <KOL_THREADS ; i++) {
            threads[i].join();
        }
        System.out.println("Application finished");
    }
}
