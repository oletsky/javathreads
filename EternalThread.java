package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * An infinite thread
 */
public class EternalThread extends Thread {
    @Override
    public void run() {
        long i=0;
        while (true) {
            i++;
            System.out.println(Thread.currentThread()+" - "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        //System.out.println(Thread.currentThread() +" finished");
    }
}
