package Generics;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return (int)(this.rollno-o.rollno);
    }
}
