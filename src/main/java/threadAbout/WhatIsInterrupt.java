package threadAbout;

import java.util.concurrent.ArrayBlockingQueue;

public class WhatIsInterrupt {

    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            public void run() {
                while(true){

                }
            }
        });


        t.start();
        t.interrupt();




        while (!t.isInterrupted()){

        }
        System.out.println(t.isInterrupted());//一直没输出！所以此方法只是将flag标记为true而已
    }
}
