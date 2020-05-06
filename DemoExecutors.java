package javatraining.oletsky.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author O.Oletsky
 * Demonstrating Executors
 * Try to replace CachedThreadPool
 * with FixedThreadPool
 */
public class DemoExecutors {
    public static void main(String[] args) {
        final int KOL_THREADS=5;
        ExecutorService exec = Executors.newCachedThreadPool();
        for (int i=0; i<5; i++) {
            exec.execute(new VerboseThread());
        }
        exec.shutdown();

    }
}
