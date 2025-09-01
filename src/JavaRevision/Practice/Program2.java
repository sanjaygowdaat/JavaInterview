package JavaRevision.Practice;

import java.util.Arrays;

public class Program2 {
    public static void main(String[] args) {
        String s = "Raja Ram Mohan Roy";
        String[] arr = s.split(" ");
        StringBuilder rev = new StringBuilder();
        for (String word : arr) {
            StringBuilder revWord = new StringBuilder();
            for (int i = word.length() - 1; i >= 0; i--) {
                revWord.append(word.charAt(i));
            }
            rev.append(revWord).append(" ");
        }
        System.out.println(rev);
    }
}
