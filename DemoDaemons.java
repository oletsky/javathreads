package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Demonstrating daemons
 * The main application launches a few threads,
 * lets the threads work for a while
 * and then stops.
 * Try to change the status of daemon for the threads to false
 */
public class DemoDaemons {
    public static void main(String[] args) throws InterruptedException {
        final int KOL_THREADS=2;
        for (int i=1; i<=KOL_THREADS; i++) {
            Thread t = new EternalThread();
            t.setDaemon(true);
            t.start();
        }
        Thread.sleep(10000);
        System.out.println("Application finished");
    }
}
