package LeetcodeEasy;

class Solution {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target=9;
        System.out.println(search(nums, target));
    }
    public static int search(int[] nums, int target)
    {
        return binarySearch(nums, 0, nums.length-1, target);
    }
    public static int binarySearch(int[]nums, int low, int high, int target)
    {
        int mid=low+(high-low)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(target<nums[mid])
        {
            return binarySearch(nums, low, mid-1, target);
        } else if (target > nums[mid]) {

            return binarySearch(nums, mid + 1, high, target);
        }
        return -1;
    }
}