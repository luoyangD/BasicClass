package juc.locks;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomClassTest {
    static AtomicInteger i=new AtomicInteger(0);
    public static void main(String[] args) throws InterruptedException {
        for(int x=0;x<20;x++){
            new Thread(new Runnable() {
                public void run() {
                    for(int j=0;j<=99;j++){
                        //Variable 'i' is accessed from within inner class, needs to be declared final
                        i.getAndIncrement();//Cannot assign a value to final variable 'i'
                        try {
                            Thread.currentThread().sleep(1);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
        }



        Thread.currentThread().sleep(2000);

//        Object o=new Object();
//        o.wait(2000);
        System.out.println(i);//2000
    }
}
