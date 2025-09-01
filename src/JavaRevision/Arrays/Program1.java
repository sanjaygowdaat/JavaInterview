package JavaRevision.Arrays;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of schools : ");
        String[][][] arr = new String[scan.nextInt()][][];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the number of classes in school " + (i + 1) + " : ");
            arr[i] = new String[scan.nextInt()][];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter the number of students in school " + (i + 1) + " class " + (j + 1) + " : ");
                arr[i][j] = new String[scan.nextInt()];
            }
        }

        scan.nextLine();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("Enter the name of school " + (i + 1) + " class " + (j + 1) + " student " + (k + 1) + " : ");
                    arr[i][j][k] = scan.nextLine();
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println("School " + (i + 1) + " class " + (j + 1) + " student " + (k + 1) + " name is : " + arr[i][j][k]);
                }
            }
        }

    }
}
