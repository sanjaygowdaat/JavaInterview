package RoughWork.Practice01;

import java.util.Arrays;
import java.util.Scanner;

public class SwappingIndexInArray
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        String[]arr=new String[scan.nextInt()];
        scan.nextLine();
        System.out.println("Enter the names : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.nextLine();
        }
        System.out.println("Array before swapping : " + Arrays.toString(arr));
        System.out.println("Enter the indexes to be swapped : ");
        int index1=scan.nextInt();
        int index2=scan.nextInt();

        String temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;

        System.out.println("Array after swapping : "+Arrays.toString(arr));
    }
}
