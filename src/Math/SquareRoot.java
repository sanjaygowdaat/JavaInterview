package Math;

import java.util.Scanner;

public class SquareRoot
{
    public static void main(String[]args)
    {
        int n = 40;
        double precision=1e-5;
        System.out.printf("%.3f",squareRoot(n,precision));
        System.out.println();
        System.out.printf("%.3f", newtonRaphsonSQRT(n));
    }

    public static double newtonRaphsonSQRT(int n) {
        double ans = n / 2;
        double previous = 0;
        while (Math.abs(ans - previous) > (1e-4)) {
            previous = ans;
            ans = 0.5 * (ans + (n / ans));
        }
        return ans;
    }

    public static double squareRoot(double n,double precision)
    {
        double low=0;
        double high=n;
        if(n<1)
        {
            high=1;
        }
        while(high-low>precision)
        {
            double mid=(low+high)/2;
            if(mid*mid>n)
            {
                high=mid;
            }
            else
            {
                low=mid;
            }
        }
        return (low+high)/2;
    }
}
