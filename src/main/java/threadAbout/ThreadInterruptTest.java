package threadAbout;

public class ThreadInterruptTest {
    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            public void run() {
                for(int i=0;i<200;i++){
                    System.out.println(i);
                }
            }
        });
        t.interrupt();
        t.start();
        t.interrupt();
        System.out.println(t.isInterrupted());//false//true
    }
}
