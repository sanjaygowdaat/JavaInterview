package OOP.Video3;

public class Child extends Parent {
    //    int x = 10;
    int d = 1;

    public Child() {
       super();
        this.d = 1;
//        super(1, 2, 3);
//        a = 1;
    }

    Child(int a, int b, int c) {
        super(a, b, c);
    }

    Child(Parent obj) {
        this.d = -1;
    }

    Child(Child obj) {
        super(1, 2, 3);
        this.d = 4;
    }

    void show() {
        System.out.println("Child class overridden method");
//        System.out.println(x);
    }

    void childSpecific() {
        System.out.println("Child-Specific");
    }

//    static void greet() {
//        System.out.println("Child class static method");
//    }
}
