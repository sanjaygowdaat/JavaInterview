package JavaRevision.Strings;

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        String s = "Welcome";
       /* char[] arr = s.toCharArray();
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println(new String(arr));*/

        String revString = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            revString += s.charAt(i);
        }
        System.out.println(revString);

        if (s.equals(revString)) {
            System.out.println("It is a palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }

    }
}
