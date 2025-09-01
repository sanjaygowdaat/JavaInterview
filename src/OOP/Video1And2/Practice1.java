package OOP.Video1And2;

public class Practice1 {
    public static void main(String[] args) {
        final int a;
        Student random = new Student(1, "Adi", 90.0f);
        System.out.println(random.rNo);
        System.out.println(random.name);
        System.out.println(random.marks);
    }
}

// constructor chaining example, why its useful
class Student {
    int rNo;
    String name;
    float marks;

    //if student does not enter the data, assign default values as follows :
    //rNO: 0, name: user, marks:0.0

    Student() {
        this(0);
//        rNo= 0;
//        name = "user";
//        marks = 0.0f;
    }

    Student(int rNo) {
        this(rNo, "user");
//        name = "user";
//        marks = 0.0f;
    }

    Student(String name) {
        this(0, name);
//        rNo = 0;
//        this.name = name;
//        marks = 0.0f;
    }

    Student(float marks) {
        this(0, marks);
    }

    Student(int rNo, String name) {
        this(rNo, name, 0.0f);
//        this.rNo = rNo;
//        this.name = name;
//        marks = 0.0f;
    }

    Student(int rNo, float marks) {
        this(rNo, "user", marks);
    }

    Student(String name, float marks) {
        this(0, name, marks);
    }

    Student(int rNo, String name, float marks) {
        this.rNo = rNo;
        this.name = name;
        this.marks = marks;
    }
}
