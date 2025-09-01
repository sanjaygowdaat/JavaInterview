package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
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
        System.out.println("Array before sorting : "+ Arrays.toString(arr));
        for(int i=0;i<arr.length-1;i++)
        {
            int min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        System.out.println("Array after sorting : "+Arrays.toString(arr));
    }
}
