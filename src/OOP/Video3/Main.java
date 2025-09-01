package OOP.Video3;

import OOP.Video4.ChildClass;
import OOP.Video4.ParentClass;

public class Main extends ParentClass{
    public static void main(String[] args) {
//        Box b1 = new Box();
//        System.out.println(b1.display());
//        BoxWeight bw1 = new BoxWeight();
//        System.out.println(bw1.prints());
//        System.out.println(bw1.w);

        // Child object in parents reference
//        Parent obj = new Child(1, 2, 3);
//        Parent obj1 = new Child();
//        System.out.print(obj.x);
//        obj.show();
//        System.out.println(obj.a + " " + obj.b + " " + obj.c);
//        System.out.println(obj1.a + " " + obj1.b + " " + obj1.c);

        // method hiding in static methods
//        Method hiding is when a child class defines a static method with the same signature as one in the parent class,
//        which prevents the parent’s static method from being overridden
//        Parent obj = new Child();
//        obj.greet();
//        Child c = new Child();
//        c.greet();

//        passing object in constructor
//        Parent obj = new Child();
//        Parent obj1 = new Child(obj);
//
//        Child obj2 = new Child();
//        Child obj3 = new Child(obj);
//
//        System.out.println(obj.d);

//        System.out.println(obj3.a + " " + obj3.b + " " + obj3.c + " " + obj3.d);

      /*  ParentClass obj = new ParentClass();
        int n = obj.a; // error

        ParentClass obj1 = new ChildClass(1);
        ChildClass obj2 = new ChildClass(1);
        int n1 = obj2.a; // error
        Main obj3 = new Main();
        int n2 = obj3.a;*/

    }
}
