package javatraining.oletsky.threads;

/**
 * @author O.Oletsky
 * Methods of a thread are called synchronously.
 * This code illustrates the difference between
 * the call of a method from outside
 * and the call of it from the thread
 */
public class ThreadWithAMethod extends Thread{
    int q;

    public void reply(boolean inside) {
        if (inside) {
            System.out.println(
                    Thread.currentThread() + " replies"
            );
        }

        else throw new RuntimeException("Deliberately thrown");
    }

    @Override
    public void run() {
        while(true) {
            this.reply(true);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
