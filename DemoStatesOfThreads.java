package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Demonstrating states of threads by monitoring them
 */
public class DemoStatesOfThreads {
    public static void main(String[] args) throws InterruptedException {
        final int KOL_THREADS=5;
        Thread[] threads = new Thread[KOL_THREADS];
        for (int i = 0; i <KOL_THREADS ; i++) {
            threads[i]=new EternalWithRandomSleepThread();
            threads[i].start();
        }
        while (true) {
            for (Thread t:threads) {
                System.out.println(t.getId()+" - "+
                        t.getState());
                }
            System.out.println("-------------");
            Thread.sleep(1000);
        }
    }
}
