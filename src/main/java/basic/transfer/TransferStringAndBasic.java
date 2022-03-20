package basic.transfer;

public class TransferStringAndBasic {
    public static void main(String[] args) {

        Integer i=20;
        String j=String.valueOf(i);
        System.out.println(j);

        //String====》Number
        //Integer int (Number)和String的转换.
        int a=Integer.parseInt("10");
        Integer b=Integer.parseInt("30");
        System.out.println(a+"+"+b);

        //Number====》String
        int a1=200;
        String s0=String.valueOf(a1);
        System.out.println(s0);

        //String Byte
        byte [] bytes={10,20,30};
        String s=bytes.toString();
        byte b1=10;
        //System.out.println(b1.toString());无法解析toString
        System.out.println(s);//[B@14ae5a5


        //char=====>String
        char c0='a';
        //String s1=c0.toString()不存在单个char转换String的方法 除非转换为包装类
        Character c=c0;
        System.out.println(c.toString());//a

        //char数组====》String
        char [] c1={'a','b','c'};
        Character [] c3={'a','b','c'};
        String s2=c1.toString();//应该会调用Character.toString(),再调用String.valueof(char []),再new String(char [])？错误,这是个数组对象不是字符对象
        String s7=c3.toString();
        System.out.println("s7:"+s7);//[Ljava.lang.Character;@6d6f6e28
        String s6=new String(c1);


        String s5="abc";
        System.out.println(s2==s5);//false
        System.out.println(s2==s6);//false

        System.out.println("c1:"+c1);//[C@7f31245a
        System.out.println(s2);//[C@7f31245a 为啥是这个而不是abc？？原因：数组对象的toString就是输出地址而已！正确做法：
        String str=new String(c1);
        System.out.println("char数组转化为String:"+str);
        System.out.println(s2.charAt(0));//[

        String s3="dsfasd";
        System.out.println(s3);//dsfasd
        String s4=new String("bbbbbb");
        System.out.println("s4:"+s4);//bbbbbb

        //String=====>char[]
        char [] c2=s2.toCharArray();
        char [] chars=str.toCharArray();
        System.out.println(chars);//abc
        System.out.println(c2);//[C@7f31245a



    }
}
