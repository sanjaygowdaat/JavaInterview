package OOP.Video4;

public class ChildClass extends ParentClass {
    public ChildClass(int a) {
        this.a = a;
    }

    public ChildClass(ParentClass parentClass) {
        this.a = parentClass.a;
    }
}
