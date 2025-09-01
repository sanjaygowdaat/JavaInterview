package OOP.Video6.ExceptionHandling;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{1, 2, 3, 4, 5};
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }

    @Override
    public Human clone() throws CloneNotSupportedException {
        try {
            Human clone = (Human) super.clone();
            clone.arr = new int[clone.arr.length];
            for (int i = 0; i < clone.arr.length; i++) {
                clone.arr[i] = this.arr[i];
            }
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
