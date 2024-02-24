package Generics;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal=new Student(78,65.29f);
        Student roshan=new Student(79,99.5f);
        Student rahul=new Student(7,88.5f);
        Student abhay=new Student(9,79.5f);
        Student aditya=new Student(10,92.5f);
        Student[]list={kunal,roshan,aditya,rahul,abhay};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o2.marks-o1.marks);
            }
        });
        System.out.println(Arrays.toString(list));
        if(kunal.compareTo(roshan)>0){
            System.out.println("kunal good");
        }else {
            System.out.println("roshan good");
        }
    }
}
