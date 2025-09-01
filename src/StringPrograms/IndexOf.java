package StringPrograms;

import java.util.Scanner;

public class IndexOf
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=scan.nextLine();
        String vowels="aeiouAEIOU";
        int count=0;
        for(char ch:s1.toCharArray())
        {
            if(vowels.indexOf(ch)!=-1)
            {
                count++;
            }
        }
        System.out.println("Number of vowels : "+count);
    }
}
