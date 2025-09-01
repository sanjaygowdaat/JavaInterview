package LeetcodeEasy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ArraysUnion
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the 1st array size : ");
        int[]arr1=new int[scan.nextInt()];
        System.out.println("Enter the size of the 2nd array : ");
        int[]arr2=new int[scan.nextInt()];
        System.out.println("Enter the elements of 1st array : ");
        for(int i=0;i<arr1.length;i++)
        {
            arr1[i]=scan.nextInt();
        }
        System.out.println("Enter the elements of second array : ");
        for(int i=0;i<arr2.length;i++)
        {
            arr2[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        union(arr1,arr2);
    }

    public static void union(int[]arr1,int[]arr2)
    {
        int n=arr1.length;
        int m=arr2.length;
        List<Integer> union=new ArrayList<Integer>();
        int i=0,j=0;
        while(i<n && j<m)
        {
            while(i>0 && i<n && arr1[i]==arr1[i-1])
            {
                i++;
            }
            while(j>0 && j<m && arr2[j]==arr2[j-1])
            {
                j++;
            }
            if(i<n && j<m)
            {
                if(arr1[i]<arr2[j])
                {
                    union.add(arr1[i]);
                    i++;
                }
                else if(arr2[j]<arr1[i])
                {
                    union.add(arr2[j]);
                    j++;
                }
                else if(arr1[i]==arr2[j])
                {
                    union.add(arr1[i]);
                    i++;
                    j++;
                }
            }

        }
        while(i<n)
        {
            while(i>0 && i<n && arr1[i]==arr1[i-1])
            {
                i++;
            }
            if(i<n)
            {
                union.add(arr1[i]);
                i++;
            }
        }
        while(j<m)
        {
            while(j>0 && j<m && arr2[j]==arr2[j-1])
            {
                j++;
            }
            if(j<m)
            {
                union.add(arr2[j]);
                j++;
            }
        }
        System.out.println(union);
    }
}
