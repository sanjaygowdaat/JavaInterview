package JavaRevision.Strings;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string1 ans string2 : ");
        String s1 = scan.next();
        String s2 = scan.next();
        if (s1.equalsIgnoreCase(s2)) {
            System.out.println(s1.concat(s2).toLowerCase());
        } else {
            System.out.println(s1.concat(s2).toUpperCase());
        }
    }
}
