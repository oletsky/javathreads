package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * A study thread informing about its running
 */
public class VerboseThread extends Thread {
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
