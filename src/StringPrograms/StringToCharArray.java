package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringToCharArray
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s=scan.nextLine();
        char[]arr=s.toCharArray();
        System.out.println(Arrays.toString(arr));
    }
}
