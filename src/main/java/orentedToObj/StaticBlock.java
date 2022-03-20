package orentedToObj;

public class StaticBlock {
    static int AX;
    static {
        AX=2;
        System.out.println("static块运行");
    }
    public StaticBlock(){

    }

    public static void main(String[] args) {
        new StaticBlock();//static块运行
        new StaticBlock();//无
    }
}
