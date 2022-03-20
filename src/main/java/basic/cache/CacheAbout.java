package basic.cache;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class CacheAbout {
    public static void main(String[] args) {
        Integer i=new Integer(10);
        Integer j=new Integer(10);
        System.out.println(i==j);//false

        String str0=new String("ABC");
        String str1=new String("ABC");
        System.out.println(str0==str1);//false,


        String str2="ABC";//进入常量池缓存
        System.out.println(str0==str2.intern());//false,证明常量池中的abc和堆中的字符串引用是不同的，new创建的字符串不进入常量池


        String str3 = "abc";//在常量池中创建abc
        String str4 = "abcd";//在常量池中创建abcd
        String str5 = str3+"d";//拼接字符串，此时会在堆中新建一个abcd的对象，因为str2编译之前是未知的
        String str6 = "abc"+"d";//拼接之后str3还是abcd，所以还是会指向字符串常量池的内存地址
        System.out.println(str4==str5);//false
        System.out.println(str4==str6);//true


    }
}
