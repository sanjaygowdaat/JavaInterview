package OOP.Video5.AbstractClass;

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent(5) {
            @Override
            void career() {
                System.out.println("Parent class object career");
            }
        };
        obj1.career();
        System.out.println(obj1.num);
        Parent.isMarried();

        Child obj = new Child(10);
        System.out.println(obj.num);

        Parent obj2 = new Child(12);
        obj2.career();
        System.out.println(obj2.num);
    }
}
