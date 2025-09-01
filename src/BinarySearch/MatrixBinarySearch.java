package BinarySearch;

import java.util.Arrays;

public class MatrixBinarySearch
{
    public static void main(String[]args)
    {
        int[][]arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=15;
        System.out.println(Arrays.toString(search(arr,target)));
    }
    public static int[] search(int[][]arr,int target)
    {
       int rStart=0; int rEnd=arr.length-1;
       int cStart=0; int cEnd=arr[0].length-1;
       int cMid=(cStart+cEnd)/2;
       int rMid;
       while(rStart<rEnd-1)
       {
           rMid=rStart+(rEnd-rStart)/2;
           if(arr[rMid][cMid]==target)
           {
               return new int[]{rMid,cMid};
           }
           else if(arr[rMid][cMid]<target)
           {
               rStart=rMid;
           }
           else
           {
               rEnd=rMid;
           }
       }
       if(arr[rStart][cMid]==target)
       {
           return new int[]{rStart,cMid};
       }
       else if(arr[rStart+1][cMid]==target)
       {
           return new int[]{rStart+1,cMid};
       }
       //1st part
       else if(target<arr[rStart][cMid])
       {
           return binarySearch(arr,rStart,0,cMid-1,target);
       }
       //2nd part
       else if(target>=arr[rStart][cMid+1] && target<=arr[rStart][cEnd])
       {
           return binarySearch(arr,rStart,cMid+1,cEnd,target);
       }
       //3rd part
       else if(target<=arr[rStart+1][cMid-1] && target>=arr[rStart+1][cStart])
       {
           return binarySearch(arr,rStart+1,0,cMid-1,target);
       }
       //4th part
       else
       {
           return binarySearch(arr,rStart+1,cMid+1,cEnd,target);
       }
    }
    public static int[] binarySearch(int[][]arr,int row,int cStart,int cEnd,int target)
    {
        while(cStart<=cEnd)
        {
            int mid=cStart+(cEnd-cStart)/2;
            if(arr[row][mid]==target)
            {
                return new int[]{row,mid};
            }
            else if(target<arr[row][mid])
            {
                cEnd=mid-1;
            }
            else
            {
                cStart=mid+1;
            }
    }
        return new int[]{-1,-1};
    }
}
