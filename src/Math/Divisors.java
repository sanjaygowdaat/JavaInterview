package Math;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Divisors
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=scan.nextInt();
        List<Integer>divisors=new ArrayList<>();

        for(int i=1;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                divisors.add(i);
                if(num/i!=i)
                {
                    divisors.add(num/i);
                }
            }
        }
        Collections.sort(divisors);
        System.out.println(divisors);
    }
}
