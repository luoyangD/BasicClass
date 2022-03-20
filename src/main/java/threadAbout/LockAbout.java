package threadAbout;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.LockSupport;

public class LockAbout {

    public boolean get(){


        LockSupport.park(this);
        return Thread.currentThread().isInterrupted();

    }

    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(new LockAbout().get());//true park的时候修改线程中断标志不会报异常 但是会打断挂起 让线程进入run状态
            }
        });
        t.start();
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.interrupt();
    }



}
