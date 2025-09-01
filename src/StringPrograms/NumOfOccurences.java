package StringPrograms;

import java.util.Scanner;

public class NumOfOccurences
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s1=scan.nextLine();
        int upper=0;
        int lower=0;
        int number=0;
        int special=0;
        for(char ch:s1.toCharArray())
        {
            if(ch>='A' && ch<='Z')
            {
                upper++;
            }
            else if(ch>='a' && ch<='z')
            {
                lower++;
            }
            else if(ch>='0' && ch<='9')
            {
                number++;
            }
            else
            {
                special++;
            }
        }
        System.out.println("Upper Case letters : "+upper);
        System.out.println("Lower Case Letters : "+lower);
        System.out.println("Number characters : "+number);
        System.out.println("Special Characters : "+special);
    }
}
