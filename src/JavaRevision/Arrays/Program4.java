package JavaRevision.Arrays;

import java.util.Arrays;

public class Program4 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        int counter;
        for (int i = 0; i < arr.length - 1; i++) {
            counter = 0;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    counter++;
                }
            }
            if(counter == 0) return;
        }
    }

}
