package OOP.Video6;

import java.util.*;

public class Student {
    int rollNo;
    int marks;

    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollNo + "|" + marks;
    }

//    @Override
//    public int compareTo(Student o) {
//        int diff = this.marks - o.marks;
//       System.out.println(diff);
//        return this.marks - o.marks;
//    }

//@Override
//public int compareTo(Student o) {
//    return (this.rollNo - o.rollNo);
//}

}

class Main2 {
    public static void main(String[] args) {
        Student s1 = new Student(1, 290);
        Student s2 = new Student(2, 190);
        Student s3 = new Student(3, 100);
        Student s4 = new Student(4, 90);
        Student s5 = new Student(5, 60);

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        list.add(s5);

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.marks - o2.marks);
            }
        });

//        Collections.sort(list, (o1, o2) -> o1.marks - o2.marks);

        System.out.println("Sorted : " + list);

//        if (s1.compareTo(s2) > 0) {
//            System.out.println("Student1 has more marks than student 2");
//        }

    }
}
