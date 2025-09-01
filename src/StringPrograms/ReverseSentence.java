package StringPrograms;

import java.util.Scanner;

public class ReverseSentence
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=scan.nextLine();
        char[]arr=s.toCharArray();
        char[]reverse=new char[arr.length];
        int revIndex=0;
        int j=arr.length-1;
        while(j>=0)
        {
            while(j>=0 && arr[j]==' ')
            {
                j--;
            }
            if(j<0)
            {
                break;
            }
            int end=j;
            while(j>=0 && arr[j]!=' ')
            {
                j--;
            }
            int start=j+1;
            while(start<=end)
            {
                reverse[revIndex++]=arr[start++];
            }
            if(revIndex<reverse.length)
            {
                reverse[revIndex++]=' ';
            }

        }
        String rev=new String(reverse).trim();
        System.out.println(rev);
    }
}
