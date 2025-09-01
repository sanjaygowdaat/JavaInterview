package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int[]arr=new int[scan.nextInt()];
        System.out.println("Enter the elements of the array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextInt();
        }
        System.out.println("Array : "+ Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Array after sorting : "+Arrays.toString(arr));
    }
}
