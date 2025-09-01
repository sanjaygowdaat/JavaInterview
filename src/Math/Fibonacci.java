package Math;

import java.util.Scanner;

public class Fibonacci
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the index number of the element in fibonacci series : ");
        int[]arr=new int[scan.nextInt()];
        arr[0]=0;
        arr[1]=1;
        for(int i=2;i<arr.length;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[arr.length-1]);
    }
}
