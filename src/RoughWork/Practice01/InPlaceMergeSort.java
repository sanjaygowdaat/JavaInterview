package RoughWork.Practice01;

import java.util.Arrays;

public class InPlaceMergeSort {
    public static void inPlaceMergeSort(int[] arr, int start, int end) {
        if(start == end) return;
        int mid = start + (end - start) / 2;

        inPlaceMergeSort(arr, start, mid);
        inPlaceMergeSort(arr, mid + 1, end);

        inPlaceMerge(arr, start, mid, end);
    }

    public static void inPlaceMerge(int[] arr, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (arr[i] == arr[j]) {
                temp[k++] = arr[i];
                temp[k++] = arr[j];
                i++;
                j++;
            } else if (arr[i] < arr[j]) {
                temp[k++] = arr[i];
                i++;
            } else {
                temp[k++] = arr[j];
                j++;
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i];
            i++;
        }
        while (j <= end) {
            temp[k++] = arr[j];
            j++;
        }

        int b = 0;
        for (int a = start; a <= end; a++) {
            arr[a] = temp[b++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 3, 2, 1};
        inPlaceMergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

}
