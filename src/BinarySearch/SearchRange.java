package BinarySearch;

import java.util.Arrays;

public class SearchRange
{
    public static void main(String[]args)
    {
        int[]arr={5,7,7,7,7,8,8,9,10};
        int target=7;
        System.out.println("Start and end range : "+ Arrays.toString(searchRange(arr,target)));
    }
    public static int[] searchRange(int[]arr,int target)
    {
        int[]ans={-1,-1};
        int start=binarySearch(arr,target,true);
        int end=binarySearch(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
    public static int binarySearch(int[]arr,int target,boolean findFirstIndex)
    {
        int ans=-1;
        int low=0,high=arr.length-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                if(findFirstIndex)
                {
                    high=mid-1;
                }
                else
                {
                    low=mid+1;
                }
            }
            else if(arr[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
