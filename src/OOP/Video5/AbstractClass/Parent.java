package OOP.Video5.AbstractClass;

public abstract class Parent {
    int num;

    public Parent() {

    }

    public Parent(int num) {
        this.num = num;
    }

    abstract void career();

    public static void isMarried() {
        System.out.println("Is not married");
    }

}
