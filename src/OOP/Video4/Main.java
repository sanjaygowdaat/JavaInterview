package OOP.Video4;

public class Main {
    public static void main(String[] args) {
        ParentClass obj = new ParentClass();
        int n = obj.a;

        ChildClass obj1 = new ChildClass(n);
        int n1 = obj1.a;

        ParentClass obj2 = new ChildClass(n);
        int n2 = obj2.a;
    }
}
