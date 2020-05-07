package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * The initial version of a thread having to be interrupted.
 * It doesn't stop.
 * Sometimes InterruptedException arises.
 */
public class InitialInterruptedThread extends Thread {

    @Override
    public void run() {
        while (true) {
            System.out.println("The thread is working");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
