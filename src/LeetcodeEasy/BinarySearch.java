package LeetcodeEasy;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
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
        System.out.println("Enter the key : ");
        int key=scan.nextInt();
        int low=0;
        int high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==key)
            {
                System.out.println("Key found at index "+mid+"!");
                return;
            }
            else if(key<arr[mid])
            {
                high=mid-1;
            }
            else if(key>arr[mid])
            {
                low=mid+1;
            }
        }
        System.out.println("Key not found!");
    }
}
