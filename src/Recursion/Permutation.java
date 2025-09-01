package Recursion;

import java.util.ArrayList;

public class Permutation {
    static int counter = 0;
    public static void main(String[] args) {
        String up = "abc";
        String p = "";
//        permutation(p, up);
        System.out.println(permutation1(p, up));
//        System.out.println(permutationCount(p, up));
        System.out.println(counter);
    }
    static void permutation(String p, String up) {
        if (up.isEmpty()) {
            System.out.print(p + " ");
            counter++;
            return;
        }
        int n = p.length();
        char ch = up.charAt(0);
        for (int i = 0; i < (n + 1); i++) {
            String firstPart = p.substring(0, i);
            String secondPart = p.substring(i, n);
            permutation(firstPart + ch + secondPart, up.substring(1));
        }
    }

    static ArrayList<String> permutation1(String processed, String unprocessed) {
        ArrayList<String> list = new ArrayList<>();
        if (unprocessed.isEmpty()) {
            counter++;
            list.add(processed);
            return list;
        }
        int n = processed.length();
        char ch = unprocessed.charAt(0);
        for (int i = 0; i < (n + 1); i++) {
            String firstPart = processed.substring(0, i);
            String secondPart = processed.substring(i, n);
            ArrayList<String> result = permutation1(firstPart + ch + secondPart, unprocessed.substring(1));
            list.addAll(result);
        }
        return list;
    }

    static int permutationCount(String p, String up) {
        if (up.isEmpty()) {
            return 1;
        }
        int count = 0;
        int n = p.length();
        char ch = up.charAt(0);
        for (int i = 0; i < (n + 1); i++) {
            String firstPart = p.substring(0, i);
            String secondPart = p.substring(i, n);
            int ans = permutationCount(firstPart + ch + secondPart, up.substring(1));
            count += ans;
        }
        return count;
    }
}

