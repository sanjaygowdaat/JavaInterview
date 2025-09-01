package BinarySearch;

public class SearchInfiniteArray
{
    public static void main(String[]args)
    {
        int[]arr={1,2,3,4,5,6,7,8,9,15,18,21,22,25,31,33,35,39,40,45,46,48,49,50,51,53,55,56,58,60,70,71,75,79,80,85,88,89,90,92,93,95,97,101,105};
        int target=35;
        System.out.println("Index of the target element is : "+searchInfiniteArray(arr,target));
    }
    public static int searchInfiniteArray(int[]arr,int target)
    {
        int low=0;
        int high=1;
        while(arr[high]<target)
        {
            int temp=low;
            low=high+1;
            high+=(high-temp+1)*2;
        }
        return binarySearch(arr,target,low,high);
    }
    public static int binarySearch(int[]arr,int target,int low,int high)
    {
        while(low<=high)
        {
            int mid=low+((high-low)/2);
            if(arr[mid]==target)
            {
                return mid;
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
        return -1;
    }
}
