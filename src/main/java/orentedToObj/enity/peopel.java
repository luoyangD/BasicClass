package orentedToObj.enity;

public class peopel {
    static {
        System.out.println("父类静态代码块执行");
    }
    int age;
    String name;
    peopel(){
        System.out.println("父构造器执行了");
    }
    peopel(int age,String name){
        System.out.println();
        this.age=age;
        this.name=name;
    }

}
