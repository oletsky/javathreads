package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Illustrates that call of the run() method
 * doesn't start a thread
 * For true multithreading calls of run()
 * should be replaced by calls of start()
 */
public class ManyRuns {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new VerboseThread();
        Thread t2 = new VerboseThread();
        t1.run();
        t2.run();
        System.out.println(Thread.currentThread()+
                " (main application) finished");
    }
}
