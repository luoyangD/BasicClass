package orentedToObj;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

public class StaticTest {
    private  static  int i;
    int j;

    private static class DA{
        void test(){
            System.out.println(i);
//            System.out.println(j);
        }

    }
    class DS{
        void test(){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        StaticTest.DA da=new StaticTest.DA();
    }
}

