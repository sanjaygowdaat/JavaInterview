package Math;

import java.util.Scanner;

public class CountDigits
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        System.out.println("Entered number is : "+num);
        int count=0;
        while(num>0)
        {
            num /= 10;
            count++;
        }
        System.out.println("Number of digits in entered number is : "+count);
    }
}
