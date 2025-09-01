package Recursion;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

// kunal kushwaha dsa playlist
public class Maze {
    public static void main(String[] args) {
        int r = 3;
        int c = 3;
//        System.out.println(mazePathsCount(r, c));
//        System.out.println(mazePath(r, c, ""));
//        mazePath1(r, c, "");
//        System.out.println(mazePath2(r, c, ""));
//        ArrayList<String> ans = includeDiagonal(r, c, "");
//        System.out.println(ans);
//        System.out.println(ans.size());
        boolean[][] arr = new boolean[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = true;
            }
        }
//        obstacle(0, 0, "", arr);
//        System.out.println(obstacle1(0, 0, "", arr));
//        backtrack(0, 0, arr, "");
//        System.out.println(backtrack1(0, 0, arr, ""));
        int[][] ans = new int[3][3];
        printPathInMatrix(0, 0, arr, "", 1, ans);
    }

    // Draw the recursion tree to understand if it looks confusing, its a long tree btw. Be patient.
    static void backtrack(int r, int c, boolean[][] arr, String p) {
        if (r == arr.length - 1 && c == arr.length - 1) {
            System.out.println(p + ",");
            return;
        }
        if (!arr[r][c]) {
            return;
        }
        arr[r][c] = false;
        if (r < arr.length - 1) {
            backtrack(r + 1, c, arr, p + 'D');
        }
        if (c < arr.length - 1) {
            backtrack(r, c + 1, arr, p + 'R');
        }
        if (r > 0) {
            backtrack(r - 1, c, arr, p + 'U');
        }
        if (c > 0) {
            backtrack(r, c - 1, arr, p + 'L');
        }
        arr[r][c] = true;
    }

    static void printPathInMatrix(int r, int c, boolean[][] arr, String p, int step, int[][] ans) {
        if (r == arr.length - 1 && c == arr.length - 1) {
            ans[r][c] = step;
            for (int i = 0; i < arr.length; i++) {
                System.out.println(Arrays.toString(ans[i]));
            }
            System.out.println(p);
            System.out.println();
            ans[r][c] = 0;
            return;
        }
        if (!arr[r][c]) {
            return;
        }
        arr[r][c] = false;
        ans[r][c] = step;
        if (r < arr.length - 1) {
            printPathInMatrix(r + 1, c, arr, p + 'D', step + 1, ans);
        }
        if (c < arr.length - 1) {
            printPathInMatrix(r, c + 1, arr, p + 'R', step + 1, ans);
        }
        if (r > 0) {
            printPathInMatrix(r - 1, c, arr, p + 'U', step + 1, ans);
        }
        if (c > 0) {
            printPathInMatrix(r, c - 1, arr, p + 'L', step + 1, ans);
        }
        arr[r][c] = true;
        ans[r][c] = 0;
    }

    static ArrayList<String> backtrack1(int r, int c, boolean[][] arr, String p) {
        if (r == arr.length - 1 && c == arr.length - 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!arr[r][c]) {
            return list;
        }
        arr[r][c] = false;
        if (r < arr.length - 1) {
            list.addAll(backtrack1(r + 1, c, arr, p + 'D'));
        }
        if (r > 0) {
            list.addAll(backtrack1(r - 1, c, arr, p + 'U'));
        }
        if (c < arr.length - 1) {
            list.addAll(backtrack1(r, c + 1, arr, p + 'R'));
        }
        if (c > 0) {
            list.addAll(backtrack1(r, c - 1, arr, p + 'L'));
        }
        arr[r][c] = true;
        return list;
    }



    static int mazePathsCount(int r, int c) {
        if (r == 1 || c == 1) {
            return 1;
        }
        int left = mazePathsCount(r - 1, c);
        int right = mazePathsCount(r, c - 1);
        return (left + right);
    }

    /* notice the difference between mazePath1 & mazePath, mazePath1 works just fine, draw the recursion tree
     for better understanding. idea behind the simplicity of this is that, we want to call both mazePath(r-1, c)
     and mazePath(r, c-1) when both r>1 and c>1, so instead of calling both and then again writing a condition for calls
     when either r or c is equal to 1, writing if r>1 and c>1 separately will call both if they are both >1
     and will call only one of it if one of the either is equal to 1.*/
    static void mazePath1(int r, int c, String p) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }
        if (r > 1) {
            mazePath1(r - 1, c, p + 'D');
        }
        if (c > 1) {
            mazePath1(r, c - 1, p + 'R');
        }
    }

    // dont do this, overcomplicating the code
    static ArrayList<String> mazePath(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if (r == 1) {
            return mazePath(r, c - 1, p + 'R');
        } else if (c == 1) {
            return mazePath(r - 1, c, p + 'D');
        } else {
            ArrayList<String> ans1 = mazePath(r - 1, c, p + 'D');
            ArrayList<String> ans2 = mazePath(r, c - 1, p + 'R');
            ans1.addAll(ans2);
            return ans1;
        }
    }

    static ArrayList<String> mazePath2(int r, int c, String p) {
        ArrayList<String> list = new ArrayList<>();
        if (r == 1 && c == 1) {
            list.add(p);
            return list;
        }
        if (r > 1) {
            ArrayList<String> ans1 = mazePath2(r - 1, c, p + 'D');
            list.addAll(ans1);
        }
        if (c > 1) {
            ArrayList<String> ans2 = mazePath2(r, c - 1, p + 'R');
            list.addAll(ans2);
        }
        return list;
    }

    static ArrayList<String> includeDiagonal(int r, int c, String p) {
        if (r == 1 && c == 1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p.substring(0, p.length() - 2));
            return list;
        }
        /* Here you are not changing local variable values r and c, or p, you are just passing the different values using
         * those variables and the value of local variable r, c and p remains the same for that particular call within the
         * scope of the method since within the scope of the method we have not modified the value of those variables
         * in our algorithm*/
        ArrayList<String> list = new ArrayList<>();
        //draw the matrix diagram and figure out why these conditions
        if (r > 1 && c > 1) {
            list.addAll(includeDiagonal(r - 1, c - 1, p + "Diagonal->"));
        }
        if (r > 1) {
            list.addAll(includeDiagonal(r - 1, c, p + "Down->"));
        }
        if (c > 1) {
            list.addAll(includeDiagonal(r, c - 1, p + "Right->"));
        }
        return list;
    }

    static void obstacle(int r, int c, String p, boolean[][] arr) {
        if (r == arr.length - 1 && c == arr.length - 1) {
            System.out.println(p);
            return;
        }
        if (!arr[r][c]) {
            return;
        }
        if (r < arr.length - 1 && c < arr.length - 1) {
            obstacle(r + 1, c + 1, p + 'D', arr);
        }
        if (r < arr.length - 1) {
            obstacle(r + 1, c, p + 'V', arr);
        }
        if (c < arr.length - 1) {
            obstacle(r, c + 1, p + 'H', arr);
        }
    }

    static ArrayList<String> obstacle1(int r, int c, String p, boolean[][] arr) {
        if (r == arr.length - 1 && c == arr[0].length - 1) {
            ArrayList<String> list = new ArrayList<String>();
            list.add(p);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        if (!arr[r][c]) {
            return list;
        }
        if (r < arr.length - 1 && c < arr.length - 1) {
            list.addAll(obstacle1(r + 1, c + 1, p + 'D', arr));
        }
        if (r < arr.length - 1) {
            list.addAll(obstacle1(r + 1, c, p + 'V', arr));
        }
        if (c < arr.length - 1) {
            list.addAll(obstacle1(r, c + 1, p + 'H', arr));
        }
        return list;
    }
}