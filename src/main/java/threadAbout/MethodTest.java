package threadAbout;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.LockSupport;

public class MethodTest {
    static void dosome(){

    }
    public static void main(String[] args) {
         Thread t=new Thread(new Runnable() {
             public void run() {

//                 System.out.println(Thread.currentThread().isInterrupted());
//                 LockSupport.park(this);
//                 System.out.println("程序没有中断");
                 while (true){
                     if(Thread.currentThread().isInterrupted()){
                         System.out.println("interrupt方法在线程运行期间起作用");
                     }
                 }
             }
         });

//        t.interrupt();
        t.start();
        try {
            Thread.currentThread().sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t.interrupt();

         LockSupport.unpark(t);


    }
}
