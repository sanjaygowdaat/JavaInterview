package RoughWork.Practice01;

public class BinarySearchRecursion
{
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target=40;
        int low=0;int high=arr.length-1;
        System.out.println("Target element is present in the array : " + binarySearch(arr, low, high, target));
    }

    static boolean binarySearch(int[] arr, int low, int high, int target) {
        int mid=low+(high-low)/2;
        if (low > high) {
            return false;
        } else if (arr[mid] == target) {
            return true;
        } else if (target > arr[mid]) {
            return binarySearch(arr, mid + 1, high, target);
        } else {
            return binarySearch(arr, low, mid - 1, target);
        }
    }
}
