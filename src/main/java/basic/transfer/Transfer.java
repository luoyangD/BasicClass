package basic.transfer;

public class Transfer {
    public static void main(String[] args) {
        //所谓的浮点型，就是指小数点可以在相应的进制的不同位置浮动。即包含所有有小数点的
        //float f=3.4;3.10是浮点型，浮点型字面值默认当做double类型来处理，因此正确写法为：
        float f=3.4f;
        //或者强制类型转换
        float d=(float)3.4;
        //或者直接写为double类型（默认的）：
        double g=3.4;

        //float f=3.40E+10;E代表10后面的数是次方数，这个叫科学计数法，默认都是浮点；
        float h=1E+38f;
        System.out.println(0.3+0.2);

        //整数加法默认向上转型，默认按照位数大的强转；
//        short s1=1;
//        s1=s1+1;
        short s1=1;
        s1+=10000000;//-27007
        System.out.println(s1);

        short s2=10000;
        System.out.println(s2);
//
//        int b=1;
//        long c=2;
//        b=c+1;
        int a=(int)2e1;

        System.out.println(a);
    }
}
