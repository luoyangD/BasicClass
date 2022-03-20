package basic.caculate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class LeftShiftAndRigihtShift {
    public static void main(String[] args) {

        Integer x=(1<<29);
        int y=-1<<29;
        int z=3<<29;
        int g=2<<29;
        System.out.println(Integer.toBinaryString(x));
        System.out.println(Integer.toBinaryString(y));
        System.out.println(Integer.toBinaryString(z));
        System.out.println(Integer.toBinaryString(g));
        System.out.println(Integer.toBinaryString(-1<<29));
        System.out.println(Integer.toBinaryString(0<<29));
    }
}
