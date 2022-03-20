package threadAbout;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;

public class CountDown {
   public CountDownLatch countDownLatch=new CountDownLatch(3);

    Thread t1=new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("t1");
        }
    });

}
