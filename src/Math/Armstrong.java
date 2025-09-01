package Math;

import java.util.*;

public class Armstrong
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        int originalNumber=num;
        int power=countDigits(num);
        int sum=0;
        int rem;
        while(num>0)
        {
            rem=num%10;
            if(rem==0)
            {
                continue;
            }
            sum+=(int) Math.pow(rem,power);
            num=num/10;
        }
        if(originalNumber==sum)
        {
            System.out.println("Number is an armstrong number!");
        }
        else
        {
            System.out.println("Number is not an armstrong number!");
        }

    }
    public static int countDigits(int num)
    {
        int count=0;
        while(num>0)
        {
            num/=10;
            count++;
        }
        return count;
    }
}
