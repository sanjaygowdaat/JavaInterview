package BinarySearch;

import java.util.Arrays;

public class MatrixSearch
{
    public static void main(String[]args)
    {
        int[][]arr={
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12}
        };
        int target=8;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    public static int[] search(int[][]arr, int target)
    {
        int row=0;
        int column=arr[0].length-1;
        while(row<arr.length && column>=0)
        {
            if(arr[row][column]==target)
            {
                return new int[]{row,column};
            }
            else if(arr[row][column]<target)
            {
                row++;
            }
            else
            {
                column--;
            }
        }
        return new int[]{-1,-1};
    }
}
