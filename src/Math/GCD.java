package Math;

import java.util.Scanner;

public class GCD
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("Math.GCD of entered numbers is : "+gcd(a,b));
    }
    public static int gcd(int a, int b)
    {
        int rem;
        while(b>0)
        {
            rem=a%b;
            a=b;
            b=rem;
        }
        return a;
    }
}
