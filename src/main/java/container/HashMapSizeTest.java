package container;

import java.util.HashMap;

public class HashMapSizeTest {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<String, String>(3);
        System.out.println();
        String str0="Aa";
        String str1="BB";
        System.out.println(str0.hashCode()==str1.hashCode());
        hashMap.put("1", "1");
        hashMap.put("Aa", "11");
        hashMap.put("BB", "66");
        hashMap.put("2","x");
        System.out.println(hashMap.size());

        System.out.println(Integer.numberOfLeadingZeros(16));//27
        System.out.println(1<<15);
        System.out.println(27|1<<15);
        int x=Integer.numberOfLeadingZeros(16) | (1 << (16 - 1));
        System.out.println(x);

    }
}
