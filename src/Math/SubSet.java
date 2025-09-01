package Math;

import java.util.ArrayList;
import java.util.List;

public class SubSet {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(subSets(arr));
//        System.out.println(subSetsDuplicates(arr));
    }

    static List<List<Integer>> subSets(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    static List<List<Integer>> subSetsDuplicates(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<Integer>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end;
            }
            end = outer.size();
            for (int j = start; j < end; j++) {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
    }
}
