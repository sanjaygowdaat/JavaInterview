package Recursion;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {50, 40, 30, 20, 10};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int leftPointer = low - 1;
        int rightPointer;
        for (rightPointer = low; rightPointer < high; rightPointer++) {
            if (arr[rightPointer] <= pivot) {
                leftPointer++;
                if (leftPointer != rightPointer) {
                    int temp = arr[leftPointer];
                    arr[leftPointer] = arr[rightPointer];
                    arr[rightPointer] = temp;
                }
            }
        }
        int pivotIndex = leftPointer + 1;
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[rightPointer];
        arr[rightPointer] = temp;
        return pivotIndex;
    }
}
