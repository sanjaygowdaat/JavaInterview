package Recursion;

/*
    -> Tail recursion is a special form of recursion where the recursive call is the very last operation performed
     within the function before returning. This means that after the recursive call is made, there are no other
     computations or operations left to execute in the current function's stack frame.
    -> No Pending Operations: The most important feature is that nothing needs to be done with the result of the recursive
     call once it returns. The function simply returns that result directly.
    ->Tail recursion often involves an "accumulator" parameter. This parameter carries the intermediate result of the
      computation from one recursive call to the next, so no post-processing is needed upon return.
 */
public class TailRecursiveFactorial {
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }

    static int factorial(int n) {
        return trFactorial(n, 1);
    }

    static int trFactorial(int n, int accumulator) {
        if (n == 1 || n == 0) {
            return accumulator;
        }
        return trFactorial(n - 1, n * accumulator);
    }
}
