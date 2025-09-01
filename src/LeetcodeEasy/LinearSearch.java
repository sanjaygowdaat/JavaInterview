package LeetcodeEasy;

import java.util.Scanner;

public class LinearSearch
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
        System.out.println("Enter the key : ");
        int key=scan.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==key)
            {
                System.out.println("Key found at index "+i+"!");
                return;
            }
        }
        System.out.println("Key not found!");
    }
}
