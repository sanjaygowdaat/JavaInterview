package LeetcodeEasy;

public class Patterns
{
    public static void main(String[] args) {
        int n=5;
//        pattern1(n);
//        pattern2(n);
//        pattern3(9);
//        pattern4(6);
//        pattern5(5);
        pattern6(5);
    }

    public static void pattern6(int n) {
        int length=2*n-2;
        for (int row = 0; row <= length; row++) {
            for (int column = 0; column <= length; column++) {
                System.out.print(n - Math.min(Math.min(row, length - row), Math.min(column, length - column)) + " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n) {
        // rows
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            //1st half of numbers
            for (int k = i; k>=1; k--) {
                System.out.print(k+" ");
            }
            //2nd half of numbers
            for (int m = 2; m <= i; m++) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
    public static void pattern4(int n)
    {
        for(int i=1;i<n*2;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=n-i;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++)
                {
                    System.out.print("* ");
                }
            }
            else
            {
                for(int j=1;j<=i-n;j++)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=2*n-i;k++)
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void pattern3(int n)
    {
        int k=0;
        for(int i=1;i<=n;i++)
        {
            if(i<=n/2)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int j=1;j<=i-k*2;j++)
                {
                    System.out.print("*");
                }
                k++;
            }
            System.out.println();
        }
    }
    public static void pattern2(int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void pattern1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
