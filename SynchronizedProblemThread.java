package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Fixing a problem with synchronyzing
 * Should o be static?
 * Try also to use ReentrantLock
 */
public class SynchronizedProblemThread extends Thread {
    static int x = 0;
    static Object o = new Object();
    @Override
    public void run() {
        for (int i=1; i<=1000; i++) {
            synchronized(o) {
                x++;
            }
        }
    }
}
