package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=scan.next();
        char[]arr=s1.toCharArray();
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            char temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;j--;
        }
        String s2=new String(arr);
        System.out.println(s2);
        if(s1.equalsIgnoreCase(s2))
        {
            System.out.println("Its a palindrome!");
        }
        else
        {
            System.out.println("Its not a palindrome!");
        }
    }
}
