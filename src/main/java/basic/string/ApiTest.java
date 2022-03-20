package basic.string;

public class ApiTest {
    public static void main(String[] args) {

        String s=new String("ADA");
        String d="sdaf";
        String intern = s.intern();
        String in=s.intern();
        System.out.println(intern);
        System.out.println(in);
        String X=d.intern();
        String y=d.intern();
        System.out.println(X);
        System.out.println(y);
    }
}
