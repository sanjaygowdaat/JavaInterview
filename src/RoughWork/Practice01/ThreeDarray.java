package RoughWork.Practice01;

import java.util.Scanner;

public class ThreeDarray
{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of schools : ");
        int[][][]arr=new int[scan.nextInt()][][];
        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the number of classes in school "+(i+1)+" : ");
            arr[i]=new int[scan.nextInt()][];
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.println("Enter the number of students in school "+(i+1)+" and class "+(j+1)+" : ");
                arr[i][j]=new int[scan.nextInt()];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++){
                    System.out.println("Enter the marks of school "+(i+1)+" class "+(j+1)+" student "+(k+1)+" : ");
                    arr[i][j][k]=scan.nextInt();
                }
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                for(int k=0;k<arr[i][j].length;k++)
                {
                    System.out.println("Marks of school "+(i+1)+" class "+(j+1)+" student "+(k+1)+" : "+arr[i][j][k]);
                }
            }
        }
    }
}
