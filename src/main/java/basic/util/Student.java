package basic.util;

public class Student implements Cloneable {
    private int age;
    int id;
//    Student(){}
    public Student(int age){
        this.age=age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", id=" + id +
                '}';
    }


}
