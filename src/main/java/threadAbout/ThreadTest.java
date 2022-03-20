package threadAbout;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.LockSupport;

import static java.lang.Thread.interrupted;

public class ThreadTest {

    public static void main(String[] args) {

        Thread t=new Thread(new Runnable() {
            public void run() {
                //                    Thread.currentThread().interrupt();
//                    interrupted();
                LockSupport.park();
//                    LockSupport.unpark(Thread.currentThread());
//                    Thread.currentThread().sleep(2000);
                System.out.println("哈哈哈，从暂停状态中恢复到运行到运行状态");//flag
                System.out.println(Thread.currentThread().isInterrupted());//false
            }
        });



        t.start();
        t.interrupt();
        System.out.println(t.isInterrupted());//true park被中断并不会修改重置中断标志


    }

}
