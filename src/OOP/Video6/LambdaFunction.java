package OOP.Video6;

public class LambdaFunction {
    public static void main(String[] args) {
//        Runnable r = () -> System.out.println("Hello world");
//        r.run();

        FInterfaceNoParam fi;

        fi = () -> 123.45;
        System.out.println(fi.num());

//        fi = () -> Math.random();
        fi = Math::random;
        System.out.println(fi.num());

        NumericTest isEven;

        isEven = (int n) -> n % 2 == 0;
        System.out.println(isEven.test(10));

        NumericTest isNonNegative;

        isNonNegative = (int n) -> n >= 0;
        System.out.println("Is a postive number : " + isNonNegative.test(9));

        NumericTest2 isFactor;

        isFactor = (int n, int d) -> (n % d) == 0;
        System.out.println("Is a factor : " + isFactor.test(10, 2));

        NumericOp factorial;

        factorial = (int n) -> {int ans=1;
            for (int i = 1; i <= n; i++) {
                ans = ans * i;
            }
            return ans;
        };
        System.out.println("Factorial of 5 is : " + factorial.operation(5));
    }
}
