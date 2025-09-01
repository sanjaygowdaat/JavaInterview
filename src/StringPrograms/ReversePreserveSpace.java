package StringPrograms;

import java.util.Scanner;

public class ReversePreserveSpace
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=scan.nextLine();
        char[]arr=s.toCharArray();
        char[]revArr=new char[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==' ')
            {
                revArr[i]=arr[i];
            }
        }
        int i=arr.length-1;
        for(char ch:arr)
        {
            while(revArr[i]==' ')
            {
                i--;
            }
            if(ch==' ')
            {
                continue;
            }
            revArr[i--]=ch;
        }
        System.out.println(new String(revArr));
    }
}
