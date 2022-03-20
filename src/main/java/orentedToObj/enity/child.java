package orentedToObj.enity;

public class child extends peopel{

    static {
        System.out.println("子类静态代码块加载了");
    }


    int pig;
    child(int pig){
        this.pig=pig;
    }
}
