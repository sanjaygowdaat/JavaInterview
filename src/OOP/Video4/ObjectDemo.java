package OOP.Video4;

public class ObjectDemo {
    int num;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public ObjectDemo(int num) {
        this.num = num;
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(3);
        ObjectDemo obj1 = new ObjectDemo(3);
        System.out.println(obj.hashCode());
        System.out.println(obj1.hashCode());
        System.out.println(obj.getClass().getName());
    }
}

