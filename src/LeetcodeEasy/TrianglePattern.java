package LeetcodeEasy;

import java.util.Scanner;

public class TrianglePattern
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int n=scan.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i*2+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
