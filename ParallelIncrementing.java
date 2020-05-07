package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Illustrates problems with parallel work
 * when each of N threads increments
 * a variable M times.
 * The result would be N*M but it may not be.
 */
public class ParallelIncrementing {
    public static void main(String[] args) throws InterruptedException {
        final int KOL_THREADS=1000;
        Thread[] threads = new Thread[KOL_THREADS];
        for (int i = 0; i < KOL_THREADS; i++) {
            Thread t = new ParallelProblemThread();
            threads[i]=t;
            t.start();
        }
        for (int i = 0; i <KOL_THREADS ; i++) {
            threads[i].join();
        }
        System.out.println(ParallelProblemThread.x);
    }
}
