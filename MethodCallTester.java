package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Illustrating calls of methods of a thread class
 */
public class MethodCallTester {
    public static void main(String[] args) throws InterruptedException {
        ThreadWithAMethod t = new ThreadWithAMethod();
        t.start();
        Thread.sleep(1000);
        t.reply(false);

    }
}
