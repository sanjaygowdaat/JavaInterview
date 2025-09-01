package Recursion;

import java.util.ArrayList;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
public class PhNoLetterCombination {
    static int counter = 0;
    public static void main(String[] args) {
        String digits = "234";
        ArrayList<String> ans = letterCombinations(digits);
        System.out.println(ans);
        System.out.println(counter);
    }
    public static ArrayList<String> letterCombinations(String digits) {
        return letterCombination("", digits);
    }

    static ArrayList<String> letterCombination(String p, String up) {
        ArrayList<String> list = new ArrayList<>();
        if (up.isEmpty()) {
            counter++;
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';
        int start = (digit - 2) * 3;
        if (digit > 7) {
            start += 1;
        }
        int end = start + 3;
        if (digit == 7 || digit == 9) {
            end = end + 1;
        }
        for (int i = start; i < end; i++) {
            char ch = (char) ('a' + i);
            ArrayList<String> ans = letterCombination(p + ch, up.substring(1));
            list.addAll(ans);
        }
        return list;
    }
}
