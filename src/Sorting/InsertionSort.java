package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort
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
        for(int i=1;i<arr.length;i++)
        {
            int j=i-1;
            int element=arr[i];
            while(j>=0 && arr[j]>element)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
        System.out.println("Array after sorting : "+Arrays.toString(arr));
    }
}
