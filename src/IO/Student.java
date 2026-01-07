package IO;

import java.io.Serializable;

public class Student implements Serializable {
    int rollNo;
    String name;
    int age;
    int marks;

    public Student(int rollNO, String name, int age, int marks) {
        this.rollNo = rollNO;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}';
    }
}
