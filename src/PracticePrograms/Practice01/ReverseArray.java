package PracticePrograms.Practice01;
import java.util.Arrays;
public class ReverseArray
{
    public static void main(String[] args) {
        int[]arr={10,20,30,40,50};
        System.out.println("Array before reversing : "+Arrays.toString(arr));
        int left=0; int right=arr.length-1;
        while(left<right)
        {
            swap(arr,left,right);
            left++; right--;
        }
        System.out.println("Array after reversing : " + Arrays.toString(arr));
    }
    public static void swap(int[]arr, int firstIndex, int secondIndex)
    {
        int temp=arr[firstIndex];
        arr[firstIndex]=arr[secondIndex];
        arr[secondIndex]=temp;
    }
}
