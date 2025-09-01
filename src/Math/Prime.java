package Math;

import java.util.Scanner;

public class Prime
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        int count=0;
        for(int i=1;i<=(int)Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                count++;
                if(num/i!=i)
                {
                    count++;
                }
            }
        }
        if(count<=2)
        {
            System.out.println("Its a prime number!");
        }
        else
        {
            System.out.println("Its not a prime number");
        }
    }
}
