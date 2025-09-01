package Math;

import java.util.Scanner;

public class CountDigits01
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        countDigits(num);
    }
    public static void countDigits(int num)
    {
        System.out.println((int)Math.log10(num)+1);
    }
}
