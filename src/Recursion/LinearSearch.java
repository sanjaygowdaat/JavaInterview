package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {30, 29, 20, 30, 30, 25, 50};
        int target = 30;
        System.out.println(linearSearch(arr, target, 0));
        System.out.println(linSearch(arr, target, 0, new ArrayList<Integer>()));
    }

    static int linearSearch(int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        } else {
            return linearSearch(arr, target, i + 1);
        }
    }

    static ArrayList<Integer> linSearch(int[] arr, int target, int i, ArrayList<Integer> list) {
        if (i == arr.length) {
            return list;
        }
        if (arr[i] == target) {
            list.add(i);
            return linSearch(arr, target, i + 1, list);
        } else {
            return linSearch(arr, target, i + 1, list);
        }
    }
}
