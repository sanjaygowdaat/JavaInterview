package OOP.Video6.ExceptionHandling;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1 = new Human(10, "Adi");
//        Human h2 = new Human(h1);

        Human h2 = h1.clone();
        System.out.println(h2.age + " | " + h2.name);
        h2.arr[0] = 10;
        System.out.println("Original Array : " + Arrays.toString(h1.arr));
        System.out.println("Cloned array : " + Arrays.toString(h2.arr));

    }
}
