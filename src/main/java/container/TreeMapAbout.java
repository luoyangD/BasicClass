package container;

import basic.util.Student;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMapAbout {
    public static void main(String[] args) {
        TreeMap<Student,String> studentStringTreeMap=new TreeMap<Student, String>();
        studentStringTreeMap.put(new Student(20),"SDFA");
        studentStringTreeMap.put(new Student(30),"DFAS");


    }

}
