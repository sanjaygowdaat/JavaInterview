package Recursion;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        System.out.println(Arrays.toString(bubbleSort(arr, 0, 0)));
    }

    static int[] bubbleSort(int[] arr, int i, int j) {
        if (j == arr.length - 1) {
            return arr;
        }
        if (i == arr.length - 1 - j) {
            return bubbleSort(arr, 0, ++j);
        }
        if (arr[i] > arr[i + 1]) {
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
            return bubbleSort(arr, i + 1, j);
        } else {
            return bubbleSort(arr, i + 1, j);
        }
    }
}
