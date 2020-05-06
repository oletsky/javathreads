package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * This program monitors the state of the thread
 * from its birth to its termination
 */
public class SimpleDemoState {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new SilentThread();
        System.out.println(t.getState());
        t.start();
        // t.start(); Illegal
        for (int i = 0; i <15 ; i++) {
            System.out.println(t.getState());
            Thread.sleep(100);
        }
        //t.start(); Illegal
        System.out.println("Program finished");

    }
}
