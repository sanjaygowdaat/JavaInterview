package Recursion;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        int target = 4;
        dice("", target);
        System.out.println();
        System.out.println(dice1(target));
    }


    static void dice(String p, int target) {
        if (target == 0) {
            System.out.print(p + " ");
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }

    static int dice1(int target) {
        if (target == 0) {
            return 1;
        }
        int count = 0;
        for (int i = 1; i <= 6 && i <= target; i++) {
            int ans = dice1(target - i);
            count += ans;
        }
        return count;
    }

    static void dice2(int target) {
        if (target == 0) {
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice2(target - i);
        }
    }
}
