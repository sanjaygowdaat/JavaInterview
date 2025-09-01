package Recursion;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(1_000); // random numbers from 0 to 999999
        }
//        int[] arr = {50, 40, 30, 20, 10};
//        int[] sorted = mergeSort(arr, 0, arr.length - 1);
//        System.out.println(Arrays.toString(sorted));
        inPlaceMergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    static void inPlaceMergeSort(int[] arr, int start, int end) {
        if (start == end) {
            return;
        }
        int mid = start + (end - start) / 2;
        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid + 1, end);
        inPlaceMerge(arr, start, mid, end);
    }

    static void inPlaceMerge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }
        while (j <= end) {
            temp[k] = arr[j];
            k++;
            j++;
        }
        for (i = start, k = 0; i <= end; i++, k++) {
            arr[i] = temp[k];
        }
    }

    static int[] mergeSort(int[] arr, int start, int end) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = start + (end - start) / 2;
        int[] left = new int[mid - start + 1];
        int[] right = new int[end - mid];
        for (int i = 0; i < left.length; i++) {
            left[i] = arr[start++];
        }
        for (int j = right.length - 1; j >= 0; j--) {
            right[j] = arr[end--];
        }
        left = mergeSort(left, 0, left.length - 1);
        right = mergeSort(right, 0, right.length - 1);

        return merge(left, right);
    }

    static int[] merge(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                temp[k++] = left[i++];
            } else {
                temp[k++] = right[j++];
            }
        }
        while (i < left.length) {
            temp[k++] = left[i++];
        }
        while (j < right.length) {
            temp[k++] = right[j++];
        }
        return temp;
    }
}
