package Sorting;
import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args) {
        int[]nums={5,4,3,2,1};
        System.out.println(Arrays.toString(nums));
        cyclicSort(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void cyclicSort(int[]nums)
    {
        int i=0;
        int correctIndex;
        while(i<nums.length)
        {
            correctIndex=nums[i]-1;
            if(nums[i]!=nums[correctIndex])
            {
                swap(nums,i,correctIndex);
            }
            else
            {
                i++;
            }
        }
    }
    static void swap(int[]nums, int firstIndex, int secondIndex)
    {
        int temp=nums[firstIndex];
        nums[firstIndex]=nums[secondIndex];
        nums[secondIndex]=temp;
    }
}
