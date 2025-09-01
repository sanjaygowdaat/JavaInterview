package Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {10, 20, 3, 4, 5, 6};
        System.out.println("Sorted : " + sorted(arr, 0));
    }

    static boolean sorted(int[]arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return (arr[i] < arr[i + 1]) && sorted(arr, i + 1);
    }

}
