package Math;

import java.util.Scanner;

public class NumberPalindrome
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        int original=num;
        System.out.println("Entered number : "+num);
        int rem;
        int rev=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reverse of entered number is : "+rev);
        if(original==rev)
        {
            System.out.println("Entered number is a palindrome number");
        }
        else
        {
            System.out.println("Entered number is not a palindrome");
        }

    }
}
