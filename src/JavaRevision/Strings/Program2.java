package JavaRevision.Strings;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        String s1 = new String("Aditya");
        String s2 = s1.intern();
        System.out.println(s1 == s2); //false
        System.out.println(s1.equals(s2)); //true

        System.out.println("---------------------");

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the string :");
        String s3 = scan.next(); // since this is taken during runtime, this string object is not stored in string pool.
        String s4 = "Hello"; // stored in string pool
        System.out.println(s3 == s4); // if s3 input is Hello, s3 == s4 -> false.
        // because s3 is outside string pool in heap memory and s4 is in string pool which is special memory inside heap memory
        // but s3.equals(s4) -> true since they have the same value
        System.out.println(s3.equals(s4));

    }
}
