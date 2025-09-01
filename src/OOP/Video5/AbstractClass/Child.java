package OOP.Video5.AbstractClass;

public class Child extends Parent {

    public Child(int num) {
        super(num);
        this.num = num;
    }

    @Override
    void career() {
        System.out.println("Child career");
    }
}
