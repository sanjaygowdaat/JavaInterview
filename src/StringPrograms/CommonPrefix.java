package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class CommonPrefix
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the string array : ");
        String[]arr=new String[scan.nextInt()];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scan.next();
        }
        System.out.println("String Array : "+Arrays.toString(arr));
        StringBuilder commonPrefix=new StringBuilder();
        commonPrefix.append("\"");
        int i=0,j=0;
        while(i<arr.length-1)
        {
            if(arr[i].charAt(j)==arr[i+1].charAt(j))
            {
                i++;
                if(i==arr.length-1)
                {
                    commonPrefix.append(arr[i].charAt(j));
                    i=0;
                    j++;
                }
            }
            else
            {
                System.out.println(commonPrefix.append("\""));
                return;
            }
        }
    }
}
