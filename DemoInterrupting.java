package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Demonstration of interrupting threads
 */
public class DemoInterrupting {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new InitialInterruptedThread();
        t.start();
        Thread.sleep(2000);
        t.interrupt();
        t.join();
        System.out.println("Application finished");
    }
}
