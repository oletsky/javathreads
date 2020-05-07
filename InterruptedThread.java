package javatraining.oletsky.threads;

/**
 * Illustrates one of possible techniques
 * for treating interrupt() request
 */
public class InterruptedThread extends Thread {

    @Override
    public void run() {
        boolean proceed=true;
        while (proceed&&!isInterrupted()) {
            System.out.println("The thread is working");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                proceed=false;
            }
        }
    }


}
