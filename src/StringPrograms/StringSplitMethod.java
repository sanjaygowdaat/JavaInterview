package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class StringSplitMethod
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=scan.nextLine();
        String[]arr=s1.trim().split("\\s+");
        for(String word:arr)
        {
            System.out.println(word);
        }
    }
}
