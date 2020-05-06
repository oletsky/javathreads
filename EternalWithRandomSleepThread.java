package javatraining.oletsky.threads;

import java.util.Random;

public class EternalWithRandomSleepThread extends Thread {
    @Override
    public void run() {
        Random r = new Random();
       while(true) {
           int n = r.nextInt(10);
           for (int i=0; i<n*1000000; i++) {
               double d = Math.exp(5.);
           }
           try {
               Thread.sleep(r.nextInt(5)*100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
