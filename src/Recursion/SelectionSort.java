package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
//        System.out.println(Arrays.toString(selectionSort(arr, 0, 1, 0)));
        System.out.println(Arrays.toString(selectionSort2(arr, arr.length - 1, arr.length - 2, arr.length - 1)));
    }

    // here we asssume last index element is the largest and then decrement the i, j and max variables and keep placing the largest elements in its right index
    static int[] selectionSort2(int[] arr, int i, int j, int max) {
        if (i == 0) {
            return arr;
        }
        if (j >= 0) {
            if (arr[j] > arr[max]) {
                return selectionSort2(arr, i, j - 1, j);
            } else {
                return selectionSort2(arr, i, j - 1, max);
            }
        } else {
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
            return selectionSort2(arr, i - 1, i - 2, i - 1);
        }

    }

    //taking smallest and placing it in its right index
    static int[] selectionSort(int[] arr, int i, int j, int min) {
        if (i == arr.length - 1) {
            return arr;
        }
        if (j < arr.length) {
            if (arr[j] < arr[min]) {
                return selectionSort(arr, i, j + 1, j);
            } else {
                return selectionSort(arr, i, j + 1, min);
            }
        } else {
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
            return selectionSort(arr, i + 1, i + 2, i + 1);
        }
    }
}
