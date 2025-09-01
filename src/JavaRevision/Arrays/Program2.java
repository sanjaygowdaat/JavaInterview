package JavaRevision.Arrays;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Enter the target element : ");
        int target = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Target found in index : " + i);
                return;
            }
        }
        System.out.println("Target not found");
    }
}
