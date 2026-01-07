import java.util.ArrayList;
import java.util.Scanner;
// important and very good example to understand the difference between pre recursion and post recursion examples,
// here list is created every time function is called, but that list is not being added pre recursion,
// It's added to returned list of next recursion call

public class Main
{
    public static void main(String[] args) {
        int[] nums = {1, 2};
        System.out.println(combinationSum4(nums, 3));
    }

    public static int combinationSum4(int[] nums, int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= target) {
                int ans = combinationSum4(nums, target - nums[i]);
                count += ans;
            }
        }
        return count;
    }
}
