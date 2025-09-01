package JavaRevision.Practice;

public abstract class Teacher {

    abstract void teach();

    abstract void project();
}

class JavaTeacher extends Teacher {

    @Override
    void teach() {
        System.out.println("Java teacher is teaching");
    }

    @Override
    void project() {
        System.out.println("Java teacher is doing java project");
    }
}

class PythonTeacher extends Teacher {

    @Override
    void teach() {
        System.out.println("Python teacher is teaching python");
    }

    @Override
    void project() {
        System.out.println("Python teacher is doing python project");
    }
}

class Main1 {

    public static void teacherBehaviour(Teacher t) {
        t.teach();
        t.project();
    }

    public static void main(String[] args) {
//        Teacher t = new Teacher(); // abstract classes cannot be instantiated
        teacherBehaviour(new JavaTeacher());
        teacherBehaviour(new PythonTeacher());
    }
}
