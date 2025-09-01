package OOP.Video3;

public class Parent {
    //    int x = 5;
    int a;
    int b;
    int c;
    int d;

    Parent() {
        a = -1;
        b = -1;
        c = -1;
    }

    Parent(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void show() {
        System.out.println("Parent");
//        System.out.println(x);
    }

    static void greet() {
        System.out.println("Parent class static method");
    }

}
