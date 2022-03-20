package basic.equals;

import basic.util.Student;

public class IntegerAndInt {
    public static void main(String[] args) {
        Integer i=1;//new Integer(1)
        String str=new String("AFSD");
        Integer [] arr={i};
        String [] arr0={str};
        Object o=new Object();
        Student student=new Student(20);
        Object [] arr1={o,student};

        System.out.println(arr0[0]);//AFSD
        System.out.println(arr[0]);//1
        System.out.println(arr1[1]);//Student{age=20, id=0}


        //==比较
        Integer i0=new Integer(1);
        System.out.println(i0==i);//false

        //

        //大于127的包装类型比较
        int x0=200;
        Integer x=200;
        Integer y=200;
        System.out.println(x==y);//false,说明常量池指的就是-126~127
        System.out.println(x0==x);//true,基本类型数据运算拆箱




    }
}
