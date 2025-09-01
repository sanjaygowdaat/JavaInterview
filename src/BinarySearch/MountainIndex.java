package BinarySearch;

public class MountainIndex
{
    public static void main(String[] args)
    {
        int[]arr={0,1,2,3,4,5,6,7,8,9,8,7,};
        System.out.println("Mountain element index is : "+mountainIndex(arr));
    }
    static int mountainIndex(int[]arr)
    {
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]>arr[mid+1])
            {
                high=mid;
            }
            else if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
        }
        return low;
    }

}
