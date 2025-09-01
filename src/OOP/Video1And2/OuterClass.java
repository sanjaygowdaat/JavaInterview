package OOP.Video1And2;

public class OuterClass {
    void greeting() {
        System.out.println("Hello!");
    }
    static class InnerClass {
        static void sayHello() {
            System.out.println("Hello there!");
        }

        void sayHey() {
            System.out.println("Hey there!!");
        }
    }
}

class Main1 {
    public static void main(String[] args) {
        /* to access inner member class ( non-static inner class) we have to create an instance of outer class and
        then using that outer class instance reference we create inner class object. because inner class is non static
        and to access any non-static member of a class, we need instance/object of that class, here its outer class object.
         */

//        OuterClass outer = new OuterClass();
//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.sayHello();

        /* to access static inner class, we dont need instance of outer class, since to access any static member of a class
        we just need class name. hence to create instance of inner static class, we use outer class name.
        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        */

        OuterClass.InnerClass inner = new OuterClass.InnerClass();
        OuterClass.InnerClass.sayHello();

        inner.sayHey();
    }
}
