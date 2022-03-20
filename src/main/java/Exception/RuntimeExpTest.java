package Exception;

public class RuntimeExpTest {

    static void dodas(){
        throw new RuntimeException();
    }

    public static void main(String[] args) {

        dodas();
//        throw new RuntimeException();
//        System.out.println(0);//Unreachable statement
    }
}
