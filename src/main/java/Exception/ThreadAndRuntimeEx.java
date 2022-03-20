package Exception;

import java.util.concurrent.TimeUnit;

public class ThreadAndRuntimeEx {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException();

            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1l);
            System.out.println("睡眠没有被打断");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("子线程抛出异常不会影响其他线程");//睡眠没有被打断
       // 子线程抛出异常不会影响其他线程

    }

}
