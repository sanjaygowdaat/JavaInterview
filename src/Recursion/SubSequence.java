package Recursion;

import java.util.ArrayList;

//take it or leave it approach
public class SubSequence {
    public static void main(String[] args) {
        String input = "abc";
        String ans = "";
        System.out.println(subseq(input, ans));
    }

    static void subsequence(String ans, String input) {
        if (input.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }
        char ch = input.charAt(0);
        subsequence(ans + ch, input.substring(1));
        subsequence(ans, input.substring(1));
    }

    static ArrayList<String> subseq(String input, String ans) {
        ArrayList<String> list = new ArrayList<>();
        if (input.isEmpty()) {
            list.add(ans);
            return list;
        }
        char ch = input.charAt(0);
        ArrayList<String> ans1 = subseq(input.substring(1), ans + ch);
        ArrayList<String> ans2 = subseq(input.substring(1), ans);
        list.addAll(ans1);
        list.addAll(ans2);
        return list;
    }
}
