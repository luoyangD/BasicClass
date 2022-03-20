package basic.caculate;

public class ThreeCaculateSignal {
    public static void main(String[] args) {
        int c=0;
        int a=false?(1>0?(c=1):0):2;
        System.out.println(a);
        System.out.println(c);//三元运算符号嵌套不会先执行内层的
    }
}
