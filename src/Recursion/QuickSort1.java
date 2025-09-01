package Recursion;

import java.util.Arrays;

public class QuickSort1 {
    public static void main(String[] args) {
        int[] arr = {10, 50, 60, 20, 5};
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
        int mid = low + (high - low) / 2;
        int pivot = arr[mid];
        int leftPointer = low;
        int rightPointer = high;
        while (leftPointer <= rightPointer) {
            while (arr[leftPointer] < pivot) {
                leftPointer++;
            }
            while (arr[rightPointer] > pivot) {
                rightPointer--;
            }
            if (leftPointer < rightPointer) {
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
                leftPointer++;
                rightPointer--;
            } else {
                return leftPointer;
            }
        }
        return leftPointer;
    }
}
