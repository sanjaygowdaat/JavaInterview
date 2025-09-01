package Math;
import java.util.ArrayList;
public class Factors {
    public static void main(String[] args) {
        int n = 40;
        factors(n);
    }

    static void factors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                list.add(n / i);
            }
        }
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i)+" ");
        }
    }
}
//kunal kushwaha