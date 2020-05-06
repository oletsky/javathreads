package javatraining.oletsky.threads;

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
