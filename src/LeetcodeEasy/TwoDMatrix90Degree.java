package LeetcodeEasy;

import java.util.Scanner;

public class TwoDMatrix90Degree
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns respectively : ");
        int row=scan.nextInt();
        int column=scan.nextInt();
        int[][] arr = new int[row][column];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the elements of row "+(i+1)+" : ");
            for(int j=0;j<arr[i].length;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println("Matrix elements display : ");
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        //Transpose Matrix
        int[][]newArr=new int[column][row];
        for(int i=0;i<arr.length;i++)
        {
          for(int j=0;j<arr[i].length;j++)
          {
              newArr[j][i]=arr[i][j];
          }
        }

        //90 degree rotation
        System.out.println("------------------");
        System.out.println("90 rotation of given matrix : ");
        for(int i=0;i<newArr.length;i++)
        {
            int j=0; int k=newArr[i].length-1;
            while(j<k)
            {
                int temp=newArr[i][j];
                newArr[i][j]=newArr[i][k];
                newArr[i][k]=temp;
                j++; k--;
            }
        }
        for(int i=0;i<newArr.length;i++)
        {
            for(int j=0;j<newArr[i].length;j++)
            {
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
