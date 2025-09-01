package JavaRevision.Practice;

public class Program3 {
    // static variables
    private static int a;
    private static int b;

    //static block
    static {
        System.out.println("Inside static block");
        a = 1;
        b = 2;
    }

    // static method
    public static void staticMethod() {
        System.out.println("Inside static method");
        System.out.println("Static variables: " + a + " " + b);
    }

    // non static variables
    int x;
    int y;

    // non static block
    {
        System.out.println("Inside non static block");
        a = 10;
        b = 20;
        x = 4;
        y = 5;
        System.out.println("Static variables : " + a + " " + b);
        System.out.println("Non static variables : " + x + " " + y);
    }

    // constructor
    public Program3() {
        System.out.println("Inside constructor");
        a = 100;
        b = 200;
        x = 40;
        y = 50;
    }

    // non static method
    public void nonStaticMethod() {
        System.out.println("Inside non static method");
        System.out.println("Static variables : " + a + " " + b);
        System.out.println("Non static variables : " + x + " " + y);
    }

}

class Main {
    public static void main(String[] args) {
        Program3.staticMethod();
        Program3 obj = new Program3();
        obj.nonStaticMethod();
    }
}
