package javatraining.oletsky.threads;

/**
 * Problems of parallel work
 */
public class ParallelProblemThread extends Thread {
    static int x = 0;
    @Override
    public void run() {
        for (int i=1; i<=1000; i++) {
            x++;
        }
    }
}
