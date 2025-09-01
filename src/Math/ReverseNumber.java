package Math;

import java.util.Scanner;

public class ReverseNumber
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        System.out.println("Number entered : "+num);
        reverse(num);
    }
    public static void reverse(int num)
    {
        int rem;
        int rev=0;
        while(num>0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        System.out.println("Reversed number : "+rev);
    }
}
